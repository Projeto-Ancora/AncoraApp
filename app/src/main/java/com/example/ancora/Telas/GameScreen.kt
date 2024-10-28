package com.example.ancora.Telas

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R


@Composable
fun GameScree(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 60.dp)
    ) {
        ClickableText(
            text = AnnotatedString("1+1"),
            onClick = { Log.d("Pergunta", "1+1");getSum(2) },
            modifier = modifier
                .drawBehind {
                    drawCircle(
                        Color.Red,
                        radius = 140f
                    )
                }
        )

        Spacer(modifier.size(20.dp))

        ClickableText(
            text = AnnotatedString("2X2"),
            onClick = { Log.d("Pergunta", "2*2"); getMult(4) },
            modifier = modifier
                .drawBehind {
                    drawCircle(
                        Color.Red,
                        radius = 140f
                    )
                }
        )

        Spacer(modifier.size(20.dp))

        ClickableText(
            text = AnnotatedString("10/2"),
            onClick = { Log.d("Pergunta", "10/2"); getDiv(5) },
            modifier = modifier
                .drawBehind {
                    drawCircle(
                        Color.Red,
                        radius = 140f
                    )
                }
        )
    }

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
                modifier
                    .size(130.dp)
            )
            Text(
                text = "4",
                modifier
                    .padding(top = 56.dp)
                    .padding(start = 69.dp)
                    .clickable { compararResultado(4) },
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Box {
            Image(
                painter = painterResource(R.drawable.peixe),
                contentDescription = "Peixe",
                modifier
                    .size(130.dp)
            )
            Text(
                text = "5",
                modifier
                    .padding(top = 56.dp)
                    .padding(start = 69.dp)
                    .clickable { compararResultado(5) },
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Box {
            Image(
                painter = painterResource(R.drawable.peixe),
                contentDescription = "Peixe",
                modifier
                    .size(130.dp)
            )
            Text(
                text = "2",
                modifier
                    .padding(top = 56.dp)
                    .padding(start = 69.dp)
                    .clickable { compararResultado(2) },
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}

val caseMult = mutableListOf<Int>();
val caseSum = mutableListOf<Int>();
val caseDiv = mutableListOf<Int>();

private fun getMult(num: Int) {
    caseMult.add(num);
}

private fun getSum(num: Int) {
    caseSum.add(num);
}

private fun getDiv(num: Int) {
    caseDiv.add(num);
}


private fun setMult(): List<Int> {
    return caseMult.toList();
}

private fun setSum(): List<Int> {
    return caseSum.toList();
}

private fun setDiv(): List<Int> {
    return caseDiv.toList();
}


private fun compararResultado(resposta: Int) {

    val mutiplicadores = setMult();
    val somadores = setSum();
    val divisores = setDiv();

    val acerto = mutiplicadores.contains(resposta) || somadores.contains(resposta) || divisores.contains(resposta)

    when{
        acerto -> {
            Log.d("Acertou", "Acertou");
        }
        else -> {
            Log.d("Errou", "Errou");
        }
    }
    resetCases();
}

private fun resetCases() {
    caseMult.clear();
    caseSum.clear();
    caseDiv.clear();
}

@Preview
@Composable
fun GameScreenPreview() {
    GameScree();
}
