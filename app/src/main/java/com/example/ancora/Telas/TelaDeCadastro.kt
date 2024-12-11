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
fun CadastroScreen(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.telacadastro),
            contentDescription = "a Minha Primeira Vez...",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )

        Image(
            painter = painterResource(id = R.drawable.logogrande),
            contentDescription = "logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 40.dp)
                .requiredWidth(212.dp)
                .requiredHeight(195.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .align(Alignment.Center)
                .padding(top = 260.dp)
        ) {
            Text(
                text = "Cadastro",
                style = TextStyle(
                    fontFamily = Fontebaloo,
                    fontSize = 28.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
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
                    .height(56.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Digite a data de nascimento",
                        style = TextStyle(fontFamily = Fontebaloo)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xffebdede)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .padding(horizontal = 16.dp)
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
                    .height(56.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Digite seu telefone",
                        style = TextStyle(fontFamily = Fontebaloo)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xffebdede)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Ao se inscrever, você concorda com nossos Termos e Condições",
                    style = TextStyle(fontSize = 14.sp, fontFamily = Fontebaloo),
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {navController.navigate("escolherpersona")},
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
    }
}