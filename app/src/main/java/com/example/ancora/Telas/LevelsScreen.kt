package com.example.ancora.Telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.ancora.R
import com.example.ancora.Telas.ComponentesPersonalizados.BarraLateral
import com.example.ancora.Telas.ComponentesPersonalizados.TopBarPerson

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
fun Trials() {

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
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.TopCenter).padding(start = 23.dp ,top = 180.dp)
            )
        }


        Box(modifier = Modifier
            .fillMaxWidth().fillMaxHeight()) {
            Text(
                "2",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Center).padding(bottom = 175.dp, end = 65.dp)

            )
        }
    Box(modifier = Modifier
        .fillMaxWidth().fillMaxHeight()) {
        Text(
            "3",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center).padding(start = 100.dp, top = 10.dp)

        )
    }
    Box(modifier = Modifier
        .fillMaxWidth().fillMaxHeight()) {
        Text(
            "4",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center).padding(start = 1.dp, top = 154.dp)

        )
    }
    Box(modifier = Modifier
        .fillMaxWidth().fillMaxHeight()) {
        Text(
            "5",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.BottomEnd).padding(end = 65.dp ,bottom = 200.dp)

        )
    }
    Box(modifier = Modifier
        .fillMaxWidth().fillMaxHeight().padding(bottom = 100.dp), contentAlignment = Alignment.BottomCenter) {
        Image(
            painterResource(R.drawable.xmapa),
            contentDescription = "X do mapa",
            modifier = Modifier.size(60.dp)
        )
    }

}


@Composable
fun Fase() {
    BackgroundFase()
    Trials()
    BarraLateral()
    TopBarPerson()
}


@Composable
@Preview
fun PreviewFase() {
    Fase()
}