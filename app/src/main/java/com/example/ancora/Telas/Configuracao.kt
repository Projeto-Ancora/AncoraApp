package com.example.teladeconfiguracao

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun ConfiguracaoScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.teladeconfiguracao),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 35.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.setavoltar),
                    contentDescription = "Seta de Voltar",
                    modifier = Modifier
                        .size(28.dp)
                        .clickable {
                            navController.popBackStack()
                        }
                )
                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Configurações",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontFamily = Fontebaloo,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)

                )
            }

            Button(
                onClick = { navController.navigate("ajudaesup") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text("Ajuda e Suporte", color = Color.White, fontSize = 24.sp, fontFamily = Fontebaloo)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { navController.navigate("sobreoapp") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text("Sobre o Aplicativo", color = Color.White, fontSize = 24.sp, fontFamily = Fontebaloo)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { navController.navigate("termos") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text("Termos de Uso", color = Color.White, fontSize = 24.sp, fontFamily = Fontebaloo)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { navController.navigate("firstscreen") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text("Trocar de Conta", color = Color.White, fontSize = 24.sp, fontFamily = Fontebaloo)
            }

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { navController.navigate("firstscreen") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text("Sair da Conta", color = Color.White, fontSize = 24.sp, fontFamily = Fontebaloo)
            }
            Spacer(modifier = Modifier.height(32.dp))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConfiguracaoScreenPreview() {
    ConfiguracaoScreen(navController = NavController(LocalContext.current))
}
