package com.example.ancora.telas.componentespersonalizados

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ancora.R
import com.example.ancora.Telas.Fase

@Composable
fun BarraLateral(navController: NavController) {
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
                        .clickable { }
                )
                Image(
                    painterResource(R.drawable.iconepet),
                    contentDescription = "pet icon",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(top = 20.dp, start = 2.dp)
                        .clickable { }
                )
                Image(
                    painterResource(R.drawable.setting),
                    contentDescription = "configuracao",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(top = 20.dp, start = 5.dp)
                        .clickable {
                            navController.navigate("config")
                        }
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 200, heightDp = 600)
@Composable
fun BarraLateralPreview() {
    val navController = rememberNavController()
    BarraLateral(navController = navController)
    Fase(navController = navController)
}
