package com.example.escolherpersonagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R
import com.example.ancora.Telas.ui.theme.AncoraTheme
import com.example.ancora.ui.theme.Fontebaloo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AncoraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
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
            painter = painterResource(id = R.drawable.backgroundcharacterscreen),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Escolha seu personagem",
                color = Color.White,
                style = TextStyle(fontSize = 30.sp, fontFamily = Fontebaloo, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 20.dp)
            )
            BotaoMarinheiroMasculino()
            Spacer(modifier = Modifier.height(16.dp))
            BotaoMarinheiroFeminino()
        }
    }
}


@Composable
fun BotaoMarinheiroMasculino(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 272.dp)
            .requiredHeight(height = 279.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 4.dp,
                    y = 46.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 228.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color(0xffff9a05))
                .border(border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 11.dp,
                    y = 42.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 228.dp)){ }
        Image(
            painter = painterResource(id = R.drawable.marinheiromasculino),
            contentDescription = "marinheiro masculino",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 42.dp)
                .requiredWidth(width = 271.dp)
                .requiredHeight(height = 237.dp))
        Text(
            text = "Marinheiro",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 27.sp,
                fontFamily = Fontebaloo,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 0.dp)
                .requiredWidth(width = 208.dp))
    }
}


@Composable
fun BotaoMarinheiroFeminino(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 268.dp)
            .requiredHeight(height = 275.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 47.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 228.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color(0xffff9a05))
                .border(border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(30.dp)))
        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 7.dp,
                    y = 43.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 228.dp)){ }
        Image(
            painter = painterResource(id = R.drawable.marinheirafeminina),
            contentDescription = "marinheirafeminina",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 4.dp,
                    y = 38.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 237.dp))
        Text(
            text = "Marinheira",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 27.sp,
                fontFamily = Fontebaloo,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 0.dp)
                .requiredWidth(width = 208.dp))
    }
}


@Preview(widthDp = 268, heightDp = 232)
@Composable
private fun BotaoMarinheiroMasculinoPreview() {
    BotaoMarinheiroMasculino(Modifier)
}

@Preview(widthDp = 268, heightDp = 275)
@Composable
private fun BotaoMarinheiroFemininoPreview() {
    BotaoMarinheiroFeminino(Modifier)
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    AncoraTheme  {
        MainContent(PaddingValues())
    }
}