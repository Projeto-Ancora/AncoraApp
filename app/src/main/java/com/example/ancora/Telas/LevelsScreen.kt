package com.example.ancora.Telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ancora.R
import com.example.ancora.Telas.ComponentesPersonalizados.TopBarPerson
import com.example.ancora.Telas.ComponentesPersonalizados.BarraLateral
import com.example.ancora.ui.theme.Fontebaloo


@Composable
fun Headerr() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .background(color = Color(0x802DA2DB)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(5.dp))
                CoinView()
            }
            Perfilz()
        }
    }
}

@Composable
fun Perfilz(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.perfil),
        contentDescription = "perfil",
        modifier = modifier
            .padding(top = 50.dp)
            .size(56.dp)
            .clip(RoundedCornerShape(50.dp))
    )
}

@Composable
fun MenuFases(modifier: Modifier = Modifier) {
    Text(
        text = "Menu de Fases!",
        color = Color.White,
        textAlign = TextAlign.Start,
        style = TextStyle(
            fontFamily = Fontebaloo,
            fontSize = 23.sp
        ),
        modifier = modifier
            .padding(start = 20.dp, top = 66.dp)
    )
}

@Composable
fun CoinView(modifier: Modifier = Modifier) {
    val scaleFactor = 1.3f

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), contentAlignment = Alignment.BottomStart
    ) {
        Box(modifier = Modifier.padding(start = (10 * scaleFactor).dp, bottom = (10 * scaleFactor).dp)) {
            Card(
                modifier = Modifier
                    .width((60 * scaleFactor).dp)
                    .height((25 * scaleFactor).dp)
                    .padding(),
                border = BorderStroke((5 * scaleFactor).dp, Color.Yellow),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {}

            Row(
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painterResource(R.drawable.dinheiro),
                    contentDescription = "Moedas coletadas",
                    modifier = Modifier.size((24 * scaleFactor).dp)
                )
                Text(
                    "200",
                    fontSize = (15 * scaleFactor).sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Fontebaloo,
                    modifier = Modifier.padding(start = (3 * scaleFactor).dp, top = (2 * scaleFactor).dp)
                )
            }
        }
    }
}




@Composable
fun BackgroundFase() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Image(
            painterResource(
                R.drawable.backgroundfase
            ), contentDescription = "Fundo do mar", modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        )

    }
}

@Composable
fun Trials(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 50.dp, start = 60.dp),
        contentAlignment = Alignment.Center,

        ) {
        Image(
            painterResource(R.drawable.mapplay),
            contentDescription = "mapa",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
    }

        Box(modifier = Modifier
            .fillMaxWidth().fillMaxHeight()) {
            Text(
                "1",
                fontSize = 40.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(start = 23.dp ,top = 180.dp)
                    .clickable {
                        navController.navigate("fase1")
                    }
                    .offset(
                        y = (12).dp
                    ),
                fontFamily = Fontebaloo
            )
        }


        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight())
        {
            Text(
                "2",
                fontSize = 40.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(bottom = 175.dp, end = 65.dp)
                    .clickable {
                        navController.navigate("fase2")
                    }
                    .offset(
                        x = (-7).dp,
                        y = (-12).dp
                    ),
                fontFamily = Fontebaloo
            )
        }

    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        Text(
            "3",
            fontSize = 40.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontFamily = Fontebaloo),
            modifier = Modifier.align(Alignment.Center).padding(start = 100.dp, top = 10.dp)

        )
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        Text(
            "4",
            fontSize = 40.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontFamily = Fontebaloo),
            modifier = Modifier.align(Alignment.Center).padding(start = 0.3.dp, top = 170.dp))
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        Text(
            "5",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = TextStyle(fontFamily = Fontebaloo),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 70.dp ,bottom = 200.dp)
                .offset(
                    x = (-8).dp,
                    y = (-15).dp
                )

        )
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight().padding(bottom = 100.dp), contentAlignment = Alignment.BottomCenter) {
        Image(
            painterResource(R.drawable.xmapa),
            contentDescription = "X do mapa",
            modifier = Modifier.size(60.dp)
        )
    }

}

@Composable
fun Fase(navController: NavController) {
    BackgroundFase()
    Headerr()
    MenuFases()
    Trials(navController)
}

@Composable
@Preview
fun PreviewFase() {
    Fase(navController = rememberNavController())
}
