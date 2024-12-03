package com.example.ancora.Telas.Game

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R

data class Bolha(
    val id: Int,
    val pergunta: String,
    val valorCorreto: Int
)

data class Peixe(
    val id: Int,
    val valor: Int
)

data class BolhaPeixe(
    val bolha: Bolha,
    val peixe: Peixe
)

@Composable
fun GameScreen(modifier: Modifier = Modifier) {

    val bolhaList = remember {
        mutableListOf(
            Bolha(1, "1+1", 2),
            Bolha(2, "2x2", 4),
            Bolha(3, "10/2", 5)
        )
    };

    val peixeList = remember {
        mutableListOf(
            Peixe(1, 2),
            Peixe(2, 4),
            Peixe(3, 5)
        )
    };

    var bolhaSelecionada by remember { mutableStateOf<Bolha?>(null) }
    var bolhaResultado by remember { mutableStateOf<Map<Int, Boolean>>(emptyMap()) };

    val bolhaPeixeList = bolhaList.mapIndexed { index, bolha ->
        peixeList.getOrNull(index)?.let { BolhaPeixe(bolha, it) }
    }

    //Coluna para renderizar os peixes e as bolhas
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .paint(
                painterResource(R.drawable.backgroundfishgame),
                contentScale = ContentScale.FillBounds
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        )
        {
            Column {
                bolhaPeixeList.forEach { pair ->
                    if (pair != null) {
                        BolhaItem(
                            pair.bolha,
                            bolhaResultado[pair.bolha.id]
                        ) {
                            bolhaSelecionada = pair.bolha;
                            bolhaResultado = emptyMap();
                        };
                    };
                };
            } //Renderiza a bolha com base em um esboço

            Column {
                bolhaPeixeList.forEach { pair ->
                    if (pair != null) {
                        PeixeItem(pair.peixe) {
                            if (bolhaSelecionada != null) {
                                verificarAcerto(bolhaSelecionada!!, pair.peixe) { acerto ->
                                    bolhaResultado = mapOf(bolhaSelecionada!!.id to acerto) // O operador !! afirma que a bolhaSelecionada nunca vai ser nula nesse contexto
                                };
                            } else {
                                bolhaResultado = bolhaList.associate { it.id to false } // Cria um map, apartir de uma coleção, onde definem como as palavras chave e os valores devem ser gerados
                            }
                        };
                    };
                };
            };
        };
    };
};

//Função para desenhar um circulo
@Composable
fun BolhaItem(
    bolha: Bolha,
    acerto: Boolean?,
    onclick: () -> Unit) {

    val corBolha1 = colorResource(R.color.corbolha1);
    val corBolha2 = colorResource(R.color.corbolha2);

    val textMeasurer = rememberTextMeasurer()
    val layout = remember(bolha.pergunta, TextStyle(color = Color.Black)) {
        textMeasurer.measure(bolha.pergunta, TextStyle(color = Color.Black))
    };

    Box(
        modifier = Modifier
            .clickable { onclick() },
    ) {
        Canvas(
            modifier = Modifier.size(100.dp)
        ) {
            val brush = Brush.verticalGradient(colors = listOf(corBolha1, corBolha2))
            drawCircle(
                brush = brush
            )
            drawText(
                textMeasurer,
                text = bolha.pergunta,
                topLeft = Offset(
                    x = center.x - layout.size.width / 2,
                    y = center.y - layout.size.height / 2
                )
            )
        };

        acerto?.let {
            CertoOuErrado(
                acerto = it,
                resultado = bolha.valorCorreto
            ) // Dá um retorno visual para o usuário
        }; // somente condições não nulas passam pela função CertoOuErrado
    };

    Spacer(modifier = Modifier.size(30.dp))

};

//Função para mostrar peixes
@Composable
fun PeixeItem(
    peixe: Peixe,
    onclick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(130.dp)
            .clickable { onclick() }
    ) {
        Image(
            painter = painterResource(R.drawable.peixe),
            contentDescription = "Peixe"
        )
        Text(
            text = peixe.valor.toString(),
            modifier = Modifier
                .padding(top = 45.dp)
                .padding(start = 69.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    };
};

private fun verificarAcerto(
    bolhaSelecionada: Bolha,
    peixeSelecionado: Peixe,
    onResult: (Boolean) -> Unit
) {
    onResult(peixeSelecionado.valor == bolhaSelecionada.valorCorreto);
}; //Função que compara 2 valores que retorna um valor booleano para "bolhaResultado"

@Composable
fun CertoOuErrado(
    acerto: Boolean,
    resultado: Int) {
    if (resultado != 0) {
        when {
            acerto -> {
                Log.d("Acertou", "acertou")
                Image(
                    painterResource(id = R.drawable.correto), contentDescription = "acerto"
                )
            };
            else -> {
                Log.d("Errou", "Errou");
                Image(
                    painterResource(id = R.drawable.errado), contentDescription = "errado"
                )
            };
        };
    };
};

@Preview
@Composable
fun GameScreenPreview() {
<<<<<<< HEAD

    GameScreen();
}
=======
    GameScreen();
}
>>>>>>> 9942d93964b29bb0c837cf2dce5f9372d1db16ce
