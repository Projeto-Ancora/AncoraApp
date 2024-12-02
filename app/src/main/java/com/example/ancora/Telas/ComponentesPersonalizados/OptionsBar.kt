package com.example.ancora.Telas.ComponentesPersonalizados

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ancora.R
import com.example.ancora.Telas.Fase


@Composable
fun BarraLateralBackground() {


}

@Composable
fun BarraLateral() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 180.dp),
        contentAlignment = Alignment.TopEnd
    ) {
        Box(
            Modifier
                .width(63.dp)
                .height(200.dp)
                .background(
                    color = Color(0x61000000),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 2.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 2.dp
                    )
                )
        ) {
            Column {
                Image(
                    painterResource(R.drawable.music),
                    contentDescription = "music icon",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(top = 20.dp, start = 10.dp)
                        .clickable { })
                Image(
                    painterResource(R.drawable.iconepet),
                    contentDescription = "pet icon",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(top = 20.dp, start = 2.dp)
                        .clickable { })
                Image(
                    painterResource(R.drawable.setting),
                    contentDescription = "music icon",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(top = 20.dp, start = 5.dp)
                        .clickable { })
            }
        }
    }

}


@Preview(showBackground = true, widthDp = 200, heightDp = 600)
@Composable
fun BarraLateralPreview() {

    BarraLateral()
    Fase()

}