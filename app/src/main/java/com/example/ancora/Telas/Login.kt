package com.example.ancora.Telas

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff2da2db))
    ) {
        Image(
            painter = painterResource(id = R.drawable.telacadastro),
            contentDescription = "Tela de cadastro",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(width = 270.dp, height = 240.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = "Login",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge.copy(fontFamily = Fontebaloo),
                modifier = Modifier.padding(bottom = 32.dp)
            )

            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Digite seu e-mail",
                        style = TextStyle(fontFamily = Fontebaloo)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xffebdede)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Digite sua senha",
                        style = TextStyle(fontFamily = Fontebaloo)
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xffebdede)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Esqueceu sua senha?",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 18.sp, fontFamily = Fontebaloo),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {navController.navigate("menu")},
                shape = RoundedCornerShape(76.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff5ad310)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
            ) {
                Text(
                    text = "Confirmar",
                    color = Color.White,
                    style = MaterialTheme.typography.headlineLarge.copy(fontFamily = Fontebaloo)
                )
            }

        }
        Image(
            painter = painterResource(id = R.drawable.setavoltar),
            contentDescription = "setavoltar",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 32.dp, y = 84.dp)
                .requiredWidth(24.dp)
                .requiredHeight(20.dp)
                .clickable {
                    navController.popBackStack()
                }
        )
    }
}
