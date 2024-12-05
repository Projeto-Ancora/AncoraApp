package com.example.ancora.Telas.TenteNovamente

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ancora.R

@Composable
fun TryAgainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .paint(
                painterResource(R.drawable.backgroundfishgame),
                contentScale = ContentScale.None
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier
                .background(Color.White)
                .size(300.dp)
        ) {
            Column {
                ElevatedButton(
                    onClick = {}
                ) {
                    Text("Tente novamente")
                }

                ElevatedButton(
                    onClick = {

                    }
                ) {
                    Text("Tente novamente")
                }
            }
        }
    }
}

@Preview
@Composable
fun ScreenPreview() {
    TryAgainScreen()
}