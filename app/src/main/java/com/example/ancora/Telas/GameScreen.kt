package com.example.ancora.Telas

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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

@Composable
fun GameScree(modifier: Modifier = Modifier) {

    var resultadoSum by remember {
        mutableIntStateOf(0);
    }
    var resultadoMult by remember {
        mutableIntStateOf(0);
    }

    var resultadoDiv by remember {
        mutableIntStateOf(0);
    }

    val (sumConditional, multConditional, divConditional) = compararResultado(
        resultadoSum, resultadoMult, resultadoDiv, caseSum, caseMult, caseDiv
    )

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 20.dp),
        content = bolhas(
            modifier,
            sumConditional,
            multConditional,
            divConditional,
            resultadoSum,
            resultadoMult,
            resultadoDiv
        )
    )

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 250.dp)
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.peixe),
                contentDescription = "Peixe",
                modifier.size(130.dp)
            )
            Text(
                text = "4",
                modifier
                    .padding(top = 56.dp)
                    .padding(start = 69.dp)
                    .clickable { resultadoMult = 4 },
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Box {
            Image(
                painter = painterResource(R.drawable.peixe),
                contentDescription = "Peixe",
                modifier.size(130.dp)
            )
            Text(
                text = "5",
                modifier
                    .padding(top = 56.dp)
                    .padding(start = 69.dp)
                    .clickable { resultadoDiv = 5 },
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Box {
            Image(
                painter = painterResource(R.drawable.peixe),
                contentDescription = "Peixe",
                modifier.size(130.dp)
            )
            Text(
                text = "2",
                modifier
                    .padding(top = 56.dp)
                    .padding(start = 69.dp)
                    .clickable { resultadoSum = 2 },
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
private fun bolhas(
    modifier: Modifier,
    sumConditional: Boolean,
    multConditional: Boolean,
    divConditional: Boolean,
    resultadoSum: Int,
    resultadoMult: Int,
    resultadoDiv: Int
): @Composable() (ColumnScope.() -> Unit) =
    {
        val corBolha1 = colorResource(R.color.corbolha1);
        val corBolha2 = colorResource(R.color.corbolha2);

        val textMeasurer = rememberTextMeasurer();
        val textDraw = "2x2";
        val style = TextStyle(
            color = Color.Black
        )
        val textLayoutResult = remember(textDraw, style) {
            textMeasurer.measure(textDraw, style)
        }

        Box {
            Canvas(modifier = Modifier
                .size(100.dp)
                .fillMaxSize()
                .clickable { caseSum.add(2) }) {
                val brush = Brush.verticalGradient(
                    colors = listOf(corBolha1, corBolha2)
                )
                drawCircle(
                    brush = brush,
                )
                drawText(
                    textMeasurer, text = "1+1", topLeft = Offset(
                        x = center.x - textLayoutResult.size.width / 2,
                        y = center.y - textLayoutResult.size.height / 2
                    )
                )
            }

            CertoOuErrado(sumConditional, resultadoSum)
        }

        Spacer(modifier.size(20.dp))

        Box {
            Canvas(modifier = Modifier
                .size(100.dp)
                .fillMaxSize()
                .clickable { caseMult.add(4) }) {
                val brush = Brush.verticalGradient(
                    colors = listOf(corBolha1, corBolha2)
                )
                drawCircle(
                    brush = brush,
                )
                drawText(
                    textMeasurer, text = textDraw, topLeft = Offset(
                        x = center.x - textLayoutResult.size.width / 2,
                        y = center.y - textLayoutResult.size.height / 2
                    )
                )
            }

            CertoOuErrado(multConditional, resultadoMult)
        }

        Spacer(modifier.size(20.dp))

        Box {
            Canvas(modifier = Modifier
                .size(100.dp)
                .fillMaxSize()
                .clickable { caseDiv.add(5) }) {
                val brush = Brush.verticalGradient(
                    colors = listOf(corBolha1, corBolha2)
                )
                drawCircle(
                    brush = brush,
                )
                drawText(
                    textMeasurer, text = "10/2", topLeft = Offset(
                        x = center.x - textLayoutResult.size.width / 1.4f,
                        y = center.y - textLayoutResult.size.height / 2
                    )
                )
            }

            CertoOuErrado(divConditional, resultadoDiv)
        }
    }

var caseSum = mutableListOf<Int>()
val caseMult = mutableListOf<Int>()
val caseDiv = mutableListOf<Int>()

private fun compararResultado(
    respostaSum: Int,
    respostaMult: Int,
    respostaDiv: Int,
    caseSum: List<Int>,
    caseMult: List<Int>,
    caseDiv: List<Int>
): Triple<Boolean, Boolean, Boolean> {
    val sumAcerto =
        caseSum.contains(respostaSum) || caseMult.contains(respostaSum) || caseDiv.contains(
            respostaSum
        )
    val multAcerto =
        caseSum.contains(respostaMult) || caseMult.contains(respostaMult) || caseDiv.contains(
            respostaMult
        )
    val divAcerto =
        caseSum.contains(respostaDiv) || caseMult.contains(respostaDiv) || caseDiv.contains(
            respostaDiv
        )

    return Triple(sumAcerto, multAcerto, divAcerto)
}

@Composable
private fun CertoOuErrado(acerto: Boolean, resultado: Int) {
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
    }
}

@Preview
@Composable
fun GameScreenPreview() {
    GameScree();
}