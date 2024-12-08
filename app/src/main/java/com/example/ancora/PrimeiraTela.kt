package com.example.ancora

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun TelaDeCadastroLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xff2da2db))
    ) {
        Image(
            painter = painterResource(id = R.drawable.telacadastro),
            contentDescription = "teladecadastro",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-2).dp,
                    y = 0.dp)
                .requiredWidth(width = 361.dp)
                .requiredHeight(height = 800.dp))
        Button(
            onClick = { },
            shape = RoundedCornerShape(76.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            contentPadding = PaddingValues(all = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .offset(x = 61.dp,
                    y = (-112).dp)
                .requiredWidth(width = 234.dp)
                .requiredHeight(height = 62.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(22.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 234.dp)
                    .requiredHeight(height = 62.dp)
            ) {
                Text(
                    text = "Fazer Login",
                    color = Color(0xfffffdfd),
                    style = MaterialTheme.typography.headlineLarge)
            }
        }
        Button(
            onClick = { },
            shape = RoundedCornerShape(76.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff9a05)),
            contentPadding = PaddingValues(all = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .offset(x = 18.dp,
                    y = (-193).dp)
                .requiredWidth(width = 328.dp)
                .requiredHeight(height = 67.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(22.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 328.dp)
                    .requiredHeight(height = 67.dp)
            ) {
                Text(
                    text = "Minha primeira vez no Âncora",
                    color = Color.White,
                    style = TextStyle(
                        fontFamily = Fontebaloo,
                        fontSize = 21.sp)
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp,
                    y = 80.dp)
                .requiredWidth(width = 306.dp)
                .requiredHeight(height = 282.dp))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TelaDeCadastroLoginPreview() {
    TelaDeCadastroLogin(Modifier)
}