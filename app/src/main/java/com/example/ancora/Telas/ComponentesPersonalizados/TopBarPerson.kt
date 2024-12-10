package com.example.ancora.Telas.ComponentesPersonalizados

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R


@Composable
fun TopBarPerson() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {

        Box(
            modifier = Modifier
                .background(color = Color(0x7A2196F3))
                .fillMaxWidth()
                .height(126.dp)
                .padding(top = 20.dp)
        ) {
            Box(modifier = Modifier.padding(start = 15.dp, top = 15.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Row {
                        Image(
                            painterResource(R.drawable.backvector),
                            contentDescription = "seta de voltar",
                            modifier = Modifier
                                .size(30.dp)
                                .clickable { }
                        )
                        Text(
                            "Menu de Fases",
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 10.dp, top = 2.dp),
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                    }
                }
            }
            Box(modifier = Modifier.padding(end = 15.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.examplemarineboy),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.CenterEnd)
                    )
                }
            }

            MoneyFase()
        }
    }

}

@Composable
fun MoneyFase() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), contentAlignment = Alignment.BottomStart
    ) {
        Box(modifier = Modifier.padding(start = 30.dp, bottom = 10.dp)) {
            Card(
                modifier = Modifier
                    .width(60.dp)
                    .height(25.dp)
                    .padding(),
                border = BorderStroke(5.dp, Color.Yellow),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White

                )
            ) {


            }
            Row(
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painterResource(R.drawable.dinheiro),
                    contentDescription = "Moedas coletadas",
                    modifier = Modifier.size(22.dp)
                )
                Text(
                    "200",
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 3.dp, top = 3.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun TopBarPersonPreview() {
    TopBarPerson()
}