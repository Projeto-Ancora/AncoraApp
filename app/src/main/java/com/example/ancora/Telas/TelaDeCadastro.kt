package com.example.ancora.Telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun CadastroScreen (modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.telacadastro),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 16.dp,
                    vertical = 24.dp
                )
                .verticalScroll(rememberScrollState())


        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {


                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo Âncora",
                    modifier = Modifier
                        .size(250.dp)
                        .padding(bottom = 0.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(100.dp)
                        .width(300.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFF9A05), // Cor de fundo do botão
                        contentColor = Color.White   // Cor do texto
                    )
                ) {
                    Text(text = "Login", fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(40.dp))

                Button(
                    onClick = { },
                    modifier = Modifier
                        .height(100.dp)
                        .width(300.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF5053FD), // Cor de fundo do botão
                        contentColor = Color.White   // Cor do texto
                    )
                ) {
                    Text(text = "Cadastrar", fontSize = 18.sp)
                }


            }
        }
    }
}