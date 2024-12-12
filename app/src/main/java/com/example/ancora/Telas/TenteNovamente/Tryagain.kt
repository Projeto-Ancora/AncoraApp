package com.example.ancora.Telas.TenteNovamente

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun TryAgainScreen(modifier: Modifier = Modifier, navController: NavHostController) {
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
                    Column(
                        verticalArrangement = Arrangement.spacedBy((-30).dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ElevatedButton(
                            onClick = { navController.popBackStack() },
                            modifier
                                .size(height = 65.dp, width = 250.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xffff9a05)),
                        ) {
                            Text(
                                "Recomeçar",
                                fontFamily = Fontebaloo,
                                fontSize = 30.7916316986084.sp,
                                color = Color.White
                            )
                        }

                        ElevatedButton(
                            onClick = { navController.navigate("menu") },
                            modifier
                                .size(height = 65.dp, width = 250.dp),
                            colors = ButtonDefaults.elevatedButtonColors(Color(0xffff9a05)),
                        ) {
                            Text(
                                "Menu",
                                color = Color.White,
                                fontSize = 30.7916316986084.sp,
                                fontFamily = Fontebaloo)
                        }
                    }
                }
            }
            Image(
                painter = painterResource(id = R.drawable.tenteagain),
                contentDescription = "Tente novamente",
                modifier = Modifier
                    .size(width = 300.dp, height = 100.dp)
                    .align(Alignment.TopCenter)
                    .offset(y = (-40).dp)
            )
        }
    }
}
