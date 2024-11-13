package com.example.ancora.Telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R
import com.example.ancora.ui.theme.AncoraTheme
import com.example.ancora.ui.theme.Fontebaloo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AncoraTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    MainContent(innerPadding)
                }
            }
        }
    }
}

@Composable
fun MainContent(innerPadding: PaddingValues) {
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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(color = Color(0x802DA2DB)),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .padding(start = 0.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        BoasVindas(
                            modifier = Modifier
                                .padding(start = 15.dp, top = 20.dp)
                                .width(278.dp)
                                .height(24.dp)
                        )
                        VisualizadorDeMoedas()
                    }
                    Perfil(
                        modifier = Modifier
                            .padding(end = 15.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            HomeButtons()
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
fun Perfil(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.perfil),
        contentDescription = "perfil",
        modifier = modifier
            .requiredSize(size = 56.dp)
            .clip(shape = RoundedCornerShape(50.dp))
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
            .width(226.dp)
            .height(24.dp)
            .offset(y = (-6).dp)
    )
}


@Composable
fun VisualizadorDeMoedas(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .width(180.dp)
            .height(50.dp)
            .padding(start = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 16.dp, y = 8.dp)
                .width(164.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(22.dp))
                .background(Color(0xfff8dd12))
                .padding(start = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 10.dp, y = 5.dp)
                    .width(130.dp)
                    .height(30.dp)
                    .clip(RoundedCornerShape(topEnd = 22.dp, bottomEnd = 22.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "20 moedas",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Fontebaloo
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 13.dp)
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.moedas),
            contentDescription = "moedas",
            modifier = modifier
                .requiredWidth(50.dp)
                .requiredHeight(60.dp)
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 4.dp)
                .clip(RoundedCornerShape(15.dp))
        )
    }
}


@Composable
fun HomeButtons(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .width(360.dp)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ButtonJogar()
        Spacer(modifier = Modifier.height(16.dp))
        ButtonLoja()
        Spacer(modifier = Modifier.height(16.dp))
        ButtonPerfil()
    }
}

@Composable
fun ButtonJogar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 306.dp)
            .requiredHeight(height = 143.dp)
    ) {
        Button(
            onClick = { },
            shape = RoundedCornerShape(75.8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 30.dp, y = 31.dp)
                .requiredWidth(width = 276.dp)
                .requiredHeight(height = 78.dp)
        ) { }

        Text(
            text = "JOGAR",
            color = Color.White,
            style = TextStyle(
                fontFamily = Fontebaloo,
                fontSize = 35.sp,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.25f),
                    offset = Offset(3.68f, 2.21f),
                    blurRadius = 0f
                )
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 159.dp, y = 42.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.iconebuttonjogar),
            contentDescription = "icone de jogar",
            modifier = Modifier
                .requiredWidth(width = 143.dp)
                .requiredHeight(height = 143.dp)
        )
    }
}

@Composable
fun ButtonLoja(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 302.dp)
            .requiredHeight(height = 143.dp)
    ) {
        Button(
            onClick = { },
            shape = RoundedCornerShape(75.8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 26.dp, y = 32.dp)
                .requiredWidth(width = 276.dp)
                .requiredHeight(height = 78.dp)
        ) { }

        Text(
            text = "Loja",
            color = Color.White,
            style = TextStyle(
                fontFamily = Fontebaloo,
                fontSize = 35.sp,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.25f),
                    offset = Offset(3.68f, 2.21f),
                    blurRadius = 0f
                )
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 175.dp, y = 43.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.iconeloja),
            contentDescription = "icone da loja",
            modifier = Modifier.requiredSize(size = 143.dp)
        )
    }
}

@Composable
fun ButtonPerfil(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 295.dp)
            .requiredHeight(height = 143.dp)
    )
    {
        Button(
            onClick = { },
            shape = RoundedCornerShape(75.8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp, y = 33.dp)
                .requiredWidth(width = 276.dp)
                .requiredHeight(height = 78.dp)
        ) { }

        Text(
            text = "Perfil",
            color = Color.White,
            style = TextStyle(
                fontFamily = Fontebaloo,
                fontSize = 35.sp,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.25f),
                    offset = Offset(3.68f, 2.21f),
                    blurRadius = 0f
                )
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 155.dp, y = 44.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.iconeperfil),
            contentDescription = "icone de perfil",
            modifier = Modifier.requiredSize(size = 143.dp)
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AncoraTheme {
        MainContent(innerPadding = PaddingValues())
    }
}


