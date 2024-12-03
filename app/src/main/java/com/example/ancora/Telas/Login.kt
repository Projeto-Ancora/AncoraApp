package com.example.ancora.Telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Fundo da tela
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo do aplicativo
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Âncora",
                modifier = Modifier
                    .size(250.dp)
                    .padding(bottom = 16.dp)
            )

            // Título
            Text(
                text = "Ajuda e Suporte",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Tela de entrada
            EntrarScreen()
        }
    }
}

@Composable
fun EntrarScreen() {
    // Estados para armazenar email e senha
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Campo de texto para email
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            placeholder = { Text("Digite seu email") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        // Campo de texto para senha
        TextField(
            value = senha,
            onValueChange = { senha = it },
            label = { Text("Senha") },
            placeholder = { Text("Digite sua senha") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),//faz a senha ficar oculta
            modifier = Modifier.fillMaxWidth()
        )

        // Botão de login
        Button(
            onClick = {
                println("Email: $email, Senha: $senha")
                // Adicione lógica de validação ou navegação aqui
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffFF9A05), // Cor de fundo do botão
                contentColor = Color.White)   // Cor do texto
        ) {
            Text("Entrar")
        }
    }
}
