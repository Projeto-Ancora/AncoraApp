package com.example.ancora.Telas.Game

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ancora.R

data class Item_dc(
    val _id: Int,
    val type: TypeItem_dc
)

enum class TypeItem_dc {
    NECESSITY,
    DESIRE
}

@Composable
fun GameScreen2(modifier: Modifier = Modifier) {

    val imageMapping = mapOf(
        Item_dc(1, TypeItem_dc.NECESSITY) to R.drawable.shirt,
        Item_dc(2, TypeItem_dc.NECESSITY) to R.drawable.arrozefeijao,
        Item_dc(1, TypeItem_dc.DESIRE) to R.drawable.urso500,
        Item_dc(2, TypeItem_dc.DESIRE) to R.drawable.lollipop500
    )

    val itemList = remember { mutableStateOf(imageMapping.keys.shuffled().toMutableList()) }

    val currentItem = remember {
        mutableStateOf(imageMapping.keys.random())
    }

    var chestNumber by remember {
        mutableIntStateOf(0)
    }
    val img = chestClick(chestNumber)

    fun getNextItem() {
        itemList.value.remove(currentItem.value)
        if (itemList.value.isEmpty()) {
            itemList.value = imageMapping.keys.shuffled().toMutableList()
        }
        currentItem.value = itemList.value.first()
    }

    //====================================
    /*
        var num by remember {
            mutableIntStateOf(7);
        };
        num = (1..3).random();
        val img = num;
    */
    //====================================

    Column(
        modifier
            .fillMaxSize()
            .paint(
                painterResource(R.drawable.backgroundnecessity),
                contentScale = ContentScale.None
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Row(
            modifier
                .fillMaxWidth()
                .padding(top = 130.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    verificarAcerto2(currentItem, TypeItem_dc.NECESSITY){}
                    getNextItem()
                },
                modifier
                    .width(150.dp)
                    .height(150.dp),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0XFFFF9A05)
                ),
            ) {
                Image(
                    painter = painterResource(R.drawable.necessity),
                    contentDescription = "necessity",
                    modifier.size(346.dp)
                )
            }

            Spacer(modifier.size(40.dp))

            Button(
                onClick = {
                    verificarAcerto2(currentItem, TypeItem_dc.DESIRE){
                        sum -> chestNumber += sum
                    };
                    getNextItem();
                },
                modifier
                    .width(150.dp)
                    .height(150.dp),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0XFFFF9A05)
                )
            ) {
                Image(
                    painter = painterResource(R.drawable.desire),
                    contentDescription = "desire",
                    modifier.size(346.dp)
                )
            };
        };

        currentItem.value.let { item ->
            val imgRes = imageMapping[item]
                ?: R.drawable.urso500 // if(imageMapping != null) imageMapping[item] else R.drawable.urso500
            Image(
                painter = painterResource(imgRes),
                contentDescription = "currentImage"
            )
        };

        Image(
            painter = painterResource(img),
            contentDescription = "chest",
            modifier
                .size(195.dp)
        )
    };
};

fun verificarAcerto2(currentItem: MutableState<Item_dc>, expectedType: TypeItem_dc, sum: (Int)-> Unit) {
    if (currentItem.value.type == expectedType) {
        Log.d("acerto", "acerto");
        sum(1)
    } else Log.d("erro", "erro");
}

fun chestClick(num: Int): Int {
    val img = when (num) {
        1 -> R.drawable.bau1
        2 -> R.drawable.bau2
        3 -> R.drawable.bau3
        4 -> R.drawable.bau4
        else -> R.drawable.chest
    }
    return img
}

@Preview
@Composable
fun GameScreen2Preview() {
    GameScreen2()
}