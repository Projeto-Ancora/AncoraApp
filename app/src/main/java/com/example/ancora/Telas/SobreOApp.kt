package com.example.ancora.Telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ancora.R
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun SobreOAplicativo(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff2da2db))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.setavoltar),
                    contentDescription = "Seta de Voltar",
                    modifier = Modifier
                        .size(28.dp)
                        .align(Alignment.CenterStart)
                        .clickable {
                            navController.popBackStack()
                        }
                )
                Text(
                    text = "Sobre o Aplicativo",
                    color = Color.White,
                    fontFamily = Fontebaloo,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(top = 16.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Image(
                painter = painterResource(id = R.drawable.logogrande),
                contentDescription = "Logo grande",
                modifier = Modifier
                    .size(256.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "O Âncora nasceu com a missão de transformar a educação financeira em algo acessível e divertido para jovens. Entendemos que aprender a lidar com dinheiro é fundamental para o sucesso pessoal e profissional, mas esse processo, muitas vezes, pode ser complicado ou até entediante. Por isso, desenvolvemos um aplicativo que combina conhecimento financeiro com jogos interativos, desafiando os usuários a tomarem decisões inteligentes e a adotarem hábitos financeiros saudáveis desde cedo.\n\n\n\nNosso objetivo é capacitar uma nova geração a gerenciar suas finanças com confiança, ensinando conceitos fundamentais como orçamento, economia, investimentos e planejamento de metas de uma forma prática e envolvente. Através do Âncora, os jovens aprendem a aplicar esses conceitos no dia a dia, de forma divertida e acessível, com desafios que os ajudam a desenvolver habilidades cruciais para o futuro.\n\n\n\nQueremos que o Âncora seja uma ferramenta que realmente faça a diferença na vida dos jovens, preparando-os para tomar decisões financeiras inteligentes e alcançar seus objetivos de vida.",
                color = Color.White,
                fontFamily = Fontebaloo,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )
        }
    }
}
