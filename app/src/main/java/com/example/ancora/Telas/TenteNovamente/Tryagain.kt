package com.example.ancora.Telas.TenteNovamente

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.vector.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

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
        Box {
            Box(
                modifier
                    .clip(RoundedCornerShape(10.dp))
                    .shadow(
                        elevation = 10.dp,
                        spotColor = Color.Black,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .size(300.dp)
                    .background(Color.White),
                contentAlignment = Alignment.BottomCenter,
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                ) {
                    ElevatedButton(
                        onClick = {},
                        modifier
                            .size(height = 65.dp, width = 250.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xffff9a05)),
                    ) {
                        Text(
                            "Tente novamente",
                            fontFamily = Fontebaloo,
                            fontSize = 20.sp,
                        )
                    }

                    ElevatedButton(
                        onClick = {},
                        modifier
                            .size(height = 65.dp, width = 150.dp),
                        colors = ButtonDefaults.elevatedButtonColors(Color(0xffff9a05)),
                    ) {
                        Text(
                            "Home",
                            color = Color.White,
                            fontFamily = Fontebaloo,
                            fontSize = 20.sp
                        )
                    }
                }
            }
            Box() {
                BannerTryAgain();
                Text(
                    "Tente novamente",
                    modifier
                        .offset(
                            x = (65).dp,
                            y = (-30).dp
                        ),
                    fontSize = 20.sp,
                    fontFamily = Fontebaloo,
                    color = Color.White
                )
            }
        };
    };
};

@Composable
fun BannerTryAgain() {
    Canvas(
        modifier = Modifier
            .size(100.dp)
    ) {
        drawRoundRect(
            color = Color(0xFF8265fe),
            size = Size(height = 280f, width = 600f),
            topLeft = Offset(x = 90f, -131f),
            cornerRadius = CornerRadius(40f, 40f)
        )
    };
};
@Preview
@Composable
fun ScreenPreview() {
    TryAgainScreen()
}