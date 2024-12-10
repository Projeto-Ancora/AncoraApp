package com.example.ancora.Telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R
import org.w3c.dom.Text

@Composable
fun SobreOAplicativo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 362.dp)
            .requiredHeight(height = 1053.dp)
            .background(color = Color(0xff2da2db))
    ) {
        TitleTrueLeftIconTrueRightIconTrue(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 65.dp))
        Text(
            text = "\n\nO Âncora nasceu com a missão de transformar a educação financeira em algo acessível e divertido para jovens. Entendemos que aprender a lidar com dinheiro é fundamental para o sucesso pessoal e profissional, mas esse processo, muitas vezes, pode ser complicado ou até entediante. Por isso, desenvolvemos um aplicativo que combina conhecimento financeiro com jogos interativos, desafiando os usuários a tomarem decisões inteligentes e a adotarem hábitos financeiros saudáveis desde cedo.\n\n\n\nNosso objetivo é capacitar uma nova geração a gerenciar suas finanças com confiança, ensinando conceitos fundamentais como orçamento, economia, investimentos e planejamento de metas de uma forma prática e envolvente. Através do Âncora, os jovens aprendem a aplicar esses conceitos no dia a dia, de forma divertida e acessível, com desafios que os ajudam a desenvolver habilidades cruciais para o futuro.\n\n\n\nQueremos que o Âncora seja uma ferramenta que realmente faça a diferença na vida dos jovens, preparando-os para tomar decisões financeiras inteligentes e alcançar seus objetivos de vida.\n",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 18.dp,
                    y = 295.dp)
                .requiredWidth(width = 334.dp)
                .requiredHeight(height = 670.dp))
        Text(
            text = "Sobre o Aplicativo",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 83.dp,
                    y = 50.dp)
                .requiredWidth(width = 209.dp)
                .requiredHeight(height = 37.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 59.dp,
                    y = 95.dp)
                .requiredWidth(width = 256.dp)
                .requiredHeight(height = 221.dp))
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxSize()){ }
    }
}

@Composable
fun TitleTrueLeftIconTrueRightIconTrue(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(15.977777481079102.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 362.dp)
            .requiredHeight(height = 60.dp)
            .padding(horizontal = 19.97222137451172.dp)
    ) {
        Text(
            text = "",
            color = Color.White,
            style = TextStyle(
                fontSize = 19.97222137451172.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .requiredWidth(width = 255.dp))
    }
}

@Preview(widthDp = 362, heightDp = 1053)
@Composable
private fun SobreOAplicativoPreview() {
    SobreOAplicativo(Modifier)
}