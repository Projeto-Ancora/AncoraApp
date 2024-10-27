package com.example.ancora.Telas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GameScree(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 25.dp)
    ) {
        Canvas(
            modifier
                .size(100.dp),
            onDraw = {
                drawCircle(Color.Red)
            }
        )
        Box(
            modifier
                .size(100.dp)
                .clip(shape = CircleShape)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "2X2",
                textAlign = TextAlign.Center
            )
        }

        Box(
            modifier
                .size(100.dp)
                .clip(shape = CircleShape)
                .background(color = Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "2X2",
                textAlign = TextAlign.Center
            )
        }

    }
}


@Preview
@Composable
fun GameScreenPreview() {
    GameScree();
}
