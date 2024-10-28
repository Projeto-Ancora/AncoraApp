package com.example.ancora.Telas

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ancora.onClick

@Composable
fun GameScree(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 60.dp)
    ) {
        ClickableText(
            text = AnnotatedString("2X2"),
            onClick = { boolCLick ->
                Log.d("ClickableText", "$boolCLick -th character is clicked.")
            },
            modifier = modifier
                .drawBehind {
                    drawCircle(
                        Color.Red,
                        radius = 140f
                    )
                }
        )

        Spacer(modifier.size(20.dp))

        ClickableText(
            text = AnnotatedString("2X2"),
            onClick = { boolCLick ->
                Log.d("ClickableText", "$boolCLick -th character is clicked.")
            },
            modifier = modifier
                .drawBehind {
                    drawCircle(
                        Color.Red,
                        radius = 140f
                    )
                }
        )

        Spacer(modifier.size(20.dp))

        ClickableText(
            text = AnnotatedString("2X2"),
            onClick = { boolCLick ->
                Log.d("ClickableText", "$boolCLick -th character is clicked.")
            },
            modifier = modifier
                .drawBehind {
                    drawCircle(
                        Color.Red,
                        radius = 140f
                    )
                }
        )
    }
}


@Preview
@Composable
fun GameScreenPreview() {
    GameScree();
}
