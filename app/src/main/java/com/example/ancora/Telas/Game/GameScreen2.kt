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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ancora.R

data class Item(
    val _id: Int,
    val type: TypeItem
)

enum class TypeItem {
    NECESSITY,
    DESIRE
}

@Composable
fun GameScreen2(modifier: Modifier = Modifier) {

    val imageMapping = mapOf(
        Item(1, TypeItem.NECESSITY) to R.drawable.shirt,
        Item(2, TypeItem.NECESSITY) to R.drawable.arrozefeijao,
        Item(1, TypeItem.DESIRE) to R.drawable.urso500,
        Item(2, TypeItem.DESIRE) to R.drawable.lollipop500
    )

    val currentItem = remember {
        mutableStateOf(imageMapping.keys.random())
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
                    when {
                        currentItem.value.type == TypeItem.NECESSITY -> {
                            Log.d("acerto", "acertou")
                        };
                        else -> {
                            Log.d("erro", "errou")
                        }
                    }
                    currentItem.value = imageMapping.keys.random();
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
                    when {
                    currentItem.value.type == TypeItem.DESIRE -> {Log.d("acerto", "acertou")}
                    else -> {Log.d("erro", "errou")}
                    }
                    currentItem.value = imageMapping.keys.random();
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
            val imgRes = imageMapping[item] ?: R.drawable.urso500
            Image(
                painter = painterResource(imgRes),
                contentDescription = "currentImage"
            )
        }

        Image(
            painter = painterResource(R.drawable.chest),
            contentDescription = "chest",
            modifier
                .size(195.dp)
        )
    };
};

@Preview
@Composable
fun GameScreen2Preview() {
    GameScreen2()
}
