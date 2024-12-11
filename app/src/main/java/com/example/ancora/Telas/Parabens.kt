package com.example.ancora.Telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ancora.R
import com.example.ancora.ui.theme.AncoraTheme
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun Congratulations(modifier: Modifier = Modifier, navController: NavController) {

    val xOffset = 60.dp

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(
                0.29f to Color(0xff6ec1e4),
                0.81f to Color(0xff3597df),
                start = Offset(180f, 0f),
                end = Offset(180f, 800f)))
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundhome),
            contentDescription = "backgroundhome",
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopStart),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = xOffset, y = 308.dp)
                .requiredWidth(width = 263.dp)
                .requiredHeight(height = 298.dp)
                .clip(shape = RoundedCornerShape(21.dp))
                .background(color = Color(0xfffffeff))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = xOffset - 20.dp, y = 280.dp)
                .requiredWidth(width = 304.dp)
                .requiredHeight(height = 302.dp)
        ) {
            Button(
                onClick = {navController.navigate("menuu") },
                shape = RoundedCornerShape(73.130126953125.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
                contentPadding = PaddingValues(all = 12.684313774108887.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = xOffset - 32.dp, y = 242.dp)
                    .requiredWidth(width = 246.dp)
                    .requiredHeight(height = 60.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(17.44093132019043.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 246.dp)
                        .requiredHeight(height = 60.dp)
                ) {
                    Text(
                        text = "MENU",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 30.7916316986084.sp,
                            fontFamily = Fontebaloo)
                    )
                }
            }
            Button(
                onClick = {navController.navigate("fasee") },
                shape = RoundedCornerShape(73.42740631103516.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
                contentPadding = PaddingValues(all = 12.73587703704834.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = xOffset - 30.dp, y = 159.dp)
                    .requiredWidth(width = 247.dp)
                    .requiredHeight(height = 62.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(17.511831283569336.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 247.dp)
                        .requiredHeight(height = 62.dp)
                ) {
                    Text(
                        text = "CONTINUAR",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 30.91680335998535.sp,
                            fontFamily = Fontebaloo)
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.parabens),
                contentDescription = "Parabens",
                modifier = Modifier
                    .requiredWidth(width = 304.dp)
                    .requiredHeight(height = 106.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.logogrande),
            contentDescription = "logogrande",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = xOffset + 2.dp, y = 62.dp)
                .requiredWidth(width = 256.dp)
                .requiredHeight(height = 221.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.coins),
            contentDescription = "coins",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = xOffset + 97.dp, y = 396.dp)
                .requiredWidth(width = 40.dp)
                .requiredHeight(height = 29.dp)
        )
        Text(
            text = "15 ",
            color = Color(0xff228aed),
            style = TextStyle(
                fontSize = 23.sp,
                fontFamily = Fontebaloo),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = xOffset + 145.dp, y = 392.dp)
                .requiredWidth(width = 24.dp)
                .requiredHeight(height = 26.dp)
        )
        Text(
            text = "Recompensa",
            color = Color(0xffffa828),
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = Fontebaloo),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = xOffset + 85.dp, y = 371.dp)
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun CongratulationsPreview() {
    Congratulations(Modifier, navController = NavController(ComponentActivity()))
}
