package com.example.ancora.Telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ancora.R
import com.example.ancora.ui.theme.AncoraTheme
import com.example.ancora.ui.theme.Fontebaloo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AncoraTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    MainContent(
                        innerPadding,
                        navController = TODO(),
                        modifier = TODO()
                    )
                }
            }
        }
    }
}

@Composable
fun MainContent(innerPadding: PaddingValues, navController: NavController, modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
        Image(
            painter = painterResource(id = R.drawable.backgroundhome),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header()
            Spacer(modifier = Modifier.height(15.dp))
            HomeButtons(navController = navController!!)
        }
        Menu(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(0.dp)
                .offset(y = (-30).dp)
        )
    }
}

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(color = Color(0x802DA2DB)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                BoasVindas()
                VisualizadorDeMoedas()
            }
            Perfil()
        }
    }
}

@Composable
fun Perfil(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.perfil),
        contentDescription = "perfil",
        modifier = modifier
            .size(56.dp)
            .clip(RoundedCornerShape(50.dp))
    )
}

@Composable
fun BoasVindas(modifier: Modifier = Modifier) {
    Text(
        text = "Bem-vindo, Marinheiro!",
        color = Color.White,
        textAlign = TextAlign.Start,
        style = TextStyle(
            fontFamily = Fontebaloo,
            fontSize = 21.sp
        ),
        modifier = modifier
            .padding(start = 15.dp)
            .offset(y = (-6).dp)
    )
}

@Composable
fun VisualizadorDeMoedas(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(start = 15.dp)
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(22.dp))
                .background(Color(0xfff8dd12))
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "200",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = Fontebaloo
                )
            )
        }
        Image(
            painter = painterResource(id = R.drawable.moedas),
            contentDescription = "moedas",
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(15.dp))
        )
    }
}

@Composable
fun HomeButtons(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonJogar(navController)
        Spacer(modifier = Modifier.height(16.dp))
        ButtonLoja(navController)
        Spacer(modifier = Modifier.height(16.dp))
        ButtonPerfil(navController)
    }
}

@Composable
fun ButtonJogar(navController: NavController) {
    ButtonComponent(
        text = "JOGAR",
        icon = R.drawable.iconebuttonjogar,
        onClick = { navController.navigate("jogar") }
    )
}

@Composable
fun ButtonLoja(navController: NavController) {
    ButtonComponent(
        text = "Loja",
        icon = R.drawable.iconeloja,
        onClick = { navController.navigate("loja") }
    )
}

@Composable
fun ButtonPerfil(navController: NavController) {
    ButtonComponent(
        text = "Perfil",
        icon = R.drawable.iconeperfil,
        onClick = { navController.navigate("perfil") }
    )
}

@Composable
fun ButtonComponent(text: String, icon: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(306.dp, 143.dp)
    ) {
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(75.8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 30.dp, y = 31.dp)
                .size(276.dp, 78.dp)
        ) { }

        Text(
            text = text,
            color = Color.White,
            style = TextStyle(
                fontFamily = Fontebaloo,
                fontSize = 35.sp,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.25f),
                    offset = Offset(3.68f, 2.21f)
                )
            ),
            modifier = Modifier
                .align(Alignment.Center)
        )

        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .size(143.dp)
                .align(Alignment.TopStart)
        )
    }
}
@Composable
fun ButtonComponent(text: String, icon: Int) {
    Box(
        modifier = Modifier
            .size(306.dp, 143.dp)
    ) {
        Button(
            onClick = { },
            shape = RoundedCornerShape(75.8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 30.dp, y = 31.dp)
                .size(276.dp, 78.dp)
        ) { }

        Text(
            text = text,
            color = Color.White,
            style = TextStyle(
                fontFamily = Fontebaloo,
                fontSize = 35.sp,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.25f),
                    offset = Offset(3.68f, 2.21f)
                )
            ),
            modifier = Modifier
                .align(Alignment.Center)
        )

        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .size(143.dp)
                .align(Alignment.TopStart)
        )
    }
}


@Composable
fun Menu(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 60.dp)
            .requiredHeight(height = 165.dp)
            .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 1.5303387641906738.dp, bottomStart = 30.606775283813477.dp, bottomEnd = 1.5303387641906738.dp))
            .background(color = Color.Black.copy(alpha = 0.38f))
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconesom),
            contentDescription = "audio",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 7.65185546875.dp,
                    y = 9.94720458984375.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 44.dp))
        Image(
            painter = painterResource(id = R.drawable.iconeconfig),
            contentDescription = "configurações",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 12.24267578125.dp,
                    y = 116.30572509765625.dp)
                .requiredSize(size = 42.dp))
        Image(
            painter = painterResource(id = R.drawable.iconepet),
            contentDescription = "pets",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 9.947265625.dp,
                    y = 61.21356201171875.dp)
                .requiredSize(size = 45.dp))
    }
}


