package com.example.ancora.Telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import org.w3c.dom.Text


@Composable
fun AjudaSuporteScreen(modifier: Modifier = Modifier) {
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
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 16.dp,
                    vertical = 24.dp
                )
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {


                Text(
                    text = "Ajuda e Suporte",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 0.dp)
                        .align(Alignment.CenterHorizontally)


                )



                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo Âncora",
                    modifier = Modifier
                        .size(250.dp)
                        .padding(bottom = 0.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp)
                        .align(Alignment.CenterHorizontally)

                ) {
                    Icon(
                        imageVector = Icons.Filled.Email, // Ícone padrão do Material Design
                        contentDescription = "Email",
                        tint = Color.Black, // Define a cor do ícone corretamente
                        modifier = Modifier.size(35.dp) // Define o tamanho do ícone
                    )

                    Text(
                        text = "projetoancoradev2024@gmail.com", color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp)
                        .align(Alignment.CenterHorizontally)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.instaicon), // Nome do arquivo no drawable
                        contentDescription = "Logo do Instagram",
                        modifier = Modifier.size(35.dp) // Define o tamanho da logo
                    )

                    Text(
                        text = "ancora_financas", color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp)
                        .align(Alignment.CenterHorizontally)

                ) {


                    Image(
                        painter = painterResource(id = R.drawable.linkedicon), // Nome do arquivo no drawable
                        contentDescription = "Logo do Instagram",
                        modifier = Modifier.size(35.dp) // Define o tamanho da logo
                    )

                    Text(
                        text = "Projeto Âncora", color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }
            }
        }
    }
}

