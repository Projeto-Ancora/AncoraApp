package com.example.ancora

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun TelaDeCadastroLogin(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff2da2db))
    ) {
        Image(
            painter = painterResource(id = R.drawable.telacadastro),
            contentDescription = "Tela de Cadastro",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 60.dp)
                .size(width = 350.dp, height = 320.dp)
        )

        Button(
            onClick = {navController.navigate("cadastro")},
            shape = RoundedCornerShape(76.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 160.dp)
                .fillMaxWidth(0.9f)
                .height(67.dp)
        ) {
            Text(
                text = "Minha primeira vez no Âncora",
                color = Color.White,
                style = TextStyle(
                    fontFamily = Fontebaloo,
                    fontSize = 21.sp
                )
            )
        }

        Button(
            onClick = { navController.navigate("login") },
            shape = RoundedCornerShape(76.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 80.dp)
                .fillMaxWidth(0.65f)
                .height(62.dp)
        ) {
            Text(
                text = "Fazer Login",
                color = Color.White,
                style = TextStyle(
                    fontFamily = Fontebaloo,
                    fontSize = 21.sp
                )
            )
        }
    }
}

