package com.example.ancora.Telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun Perfil(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xff2da2db))
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundnecessity),
            contentDescription = "backgroundnecessity",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp, start = 16.dp, end = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.setavoltar),
                contentDescription = "setadevoltar",
                modifier = Modifier
                    .size(28.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
            Spacer(modifier = Modifier.weight(0.7f))
            Text(
                text = "Perfil",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 36.sp,
                    fontFamily = Fontebaloo
                ),
                modifier = Modifier.weight(2f)
            )
            Spacer(modifier = Modifier.weight(1f))
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 110.dp)
                .size(267.dp, 244.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(color = Color(0xffff9a05))
                .border(1.dp, Color.Black, RoundedCornerShape(30.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.marinheiromasculino),
                contentDescription = "marinheiromasculino",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Text(
            text = "Marinheiro",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 30.sp,
                letterSpacing = (-1).sp,
                fontFamily = Fontebaloo
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 380.dp)
        )

        Button(
            onClick = { },
            shape = RoundedCornerShape(97.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            contentPadding = PaddingValues(20.dp),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 437.dp)
                .size(329.dp, 77.dp)
        ) {
            Text(
                text = "EDITAR",
                color = Color.White,
                style = TextStyle(
                    fontSize = 30.sp,
                    fontFamily = Fontebaloo
                )
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun PerfilPreview() {
    Perfil(modifier = Modifier, navController = rememberNavController())
}
