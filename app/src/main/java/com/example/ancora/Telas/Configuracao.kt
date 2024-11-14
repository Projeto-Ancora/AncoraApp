package com.example.teladeconfigurao

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
import com.example.ancora.R

@Composable
fun ConfiguracaoScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onAjudaClick: () -> Unit,
    onTermosClick: () -> Unit,
    onSobreClick: () -> Unit,
    onTrocarClick: () -> Unit,
    onSairContaClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.teladeconfiguracao),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Start)
                    .clickable(onClick = onBackClick)
                    .padding(vertical = 16.dp)

            )

            { Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(id = R.drawable.setavoltar),
                    contentDescription = "Voltar",
                    tint = Color.White,
                    modifier = Modifier.size(60.dp)
                        .fillMaxSize()
                        .requiredSize(size = 36.dp)
                        .clickable(onClick = onBackClick)

                )

                Spacer(modifier = Modifier.width(8.dp)) // Espaçamento entre a seta e o texto

                Text(
                    text = "Configurações",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = onAjudaClick,
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
                onClick = onSobreClick,
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
                onClick = onTrocarClick,
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
                onClick = onSairContaClick,
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
}
