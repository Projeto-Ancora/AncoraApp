package com.example.teladeconfiguracao

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ancora.R

@Composable
fun ConfiguracaoScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.teladeconfiguracao),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
                Spacer(modifier = Modifier.width(8.dp)) // Espaço entre ícone e texto
                Text(
                    text = "Configurações",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(35.dp))

            // Botões das Configurações
            Button(
                onClick = { /* TODO: Implementar Ajuda e Suporte */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Ajuda e Suporte", color = Color.White, fontSize = 24.sp)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { /* TODO: Implementar Sobre o Aplicativo */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Sobre o Aplicativo", color = Color.White, fontSize = 24.sp)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { /* TODO: Implementar Trocar de Conta */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Trocar de Conta", color = Color.White, fontSize = 24.sp)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { /* TODO: Implementar Sair da Conta */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Sair da Conta", color = Color.White, fontSize = 24.sp)
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }

