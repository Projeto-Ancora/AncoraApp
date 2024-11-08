package com.example.ancora.Telas

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ancora.R


@Composable
fun ShopLayout(modifier: Modifier){
    BackgroundShop()
    TopLayout()
    SereiaBackground()
    ShopItens()
    Money()
}

@Composable
fun Money(){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top= 145.dp).fillMaxWidth().fillMaxHeight()

    ) {
        Card(
            modifier= Modifier.width(60.dp).height(25.dp),
            border = BorderStroke(5.dp,Color.Yellow),
            colors = CardDefaults.cardColors(
                containerColor = Color.White

            ) ) {

        }
    }
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top= 147.dp, end = 10.dp).fillMaxWidth().fillMaxHeight()

    ){
        Image(painterResource(R.drawable.dinheiro), contentDescription = "Moedas coletadas", modifier = Modifier.size(22.dp))
        Text("200", fontSize = 15.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 3.dp, top= 3.dp))
    }
}
@Composable
fun TopLayout() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 20.dp).fillMaxWidth().fillMaxHeight(),
    ) {
        Image(painterResource(R.drawable.placa), contentDescription = "Placa", modifier = Modifier.width(250.dp).height(200.dp))

    }
    Box(modifier = Modifier.fillMaxWidth()) {

        Image(painterResource(R.drawable.tenda), contentDescription = "Tenda", modifier = Modifier.width(450.dp).height(90.dp).padding(bottom = 18.dp))
    }
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 90.dp).fillMaxWidth().fillMaxHeight()
    ) {
Text(" Loja da Sereia \n Corada", fontSize = 20.sp, fontFamily = FontFamily.Cursive ,color = Color(0xFF862901))
}

}
@Composable
fun SereiaBackground(){
Column (
horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
       modifier = Modifier.fillMaxWidth().fillMaxHeight()
) {
    Box(
        modifier = Modifier.padding(bottom = 70.dp)
    ) {
        Image(
            painterResource(R.drawable.sereia),
            contentDescription = "Sereia",
            modifier = Modifier.size(200.dp)
        )
    }
}
}

@Composable
fun ItensUnit(@DrawableRes image: Int, descricao: String, preco:Int, modificador: Modifier, tamanho:Int){

    ElevatedCard(modificador, elevation = CardDefaults.cardElevation(
        defaultElevation = 6.dp
    ), colors = CardDefaults.cardColors(
        containerColor = Color(0xFF0094FF),
    ),) {
        Column {
            Card(
                modifier = Modifier.padding(start = 8.dp, top = 5.dp).width(70.dp).height(40.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                )
            ) {
                Image(
                    painterResource(image),
                    contentDescription = descricao,
                    modifier = Modifier.size(tamanho.dp).padding(start = 21.dp, top = 1.dp)
                )
            }
            Row(
                modifier=Modifier.padding(start=18.dp, top=6.dp)
            ) {
                Image(painterResource(R.drawable.dinheiro), contentDescription = "Dinheiro", modifier= Modifier.size(15.dp))
                Text("$preco", fontSize = 15.sp, color = Color.White, modifier = Modifier.padding(start=3.dp, bottom = 8.dp))
            }
        }
    }
}
@Composable
fun ShopItens(){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment= Alignment.CenterHorizontally,
        modifier = Modifier.padding(top=320.dp).fillMaxWidth().fillMaxHeight()
    ) {
        Row(

        ) {
            ItensUnit(R.drawable.pinguim, "Pinguim", 30, Modifier.width(100.dp).height(80.dp).padding(end = 12.dp),50)
            ItensUnit(R.drawable.carangueijo, "Carangueijo", 10, Modifier.width(90.dp).height(80.dp), 60)
            ItensUnit(R.drawable.tartaruga, "Tartaruga", 15, Modifier.width(100.dp).height(80.dp).padding(start = 10.dp),60)
        }
        Row(
            modifier = Modifier.padding(top=10.dp)
        )  {
            ItensUnit(R.drawable.estrela, "Estrela do mar", 50, Modifier.width(100.dp).height(80.dp).padding(end = 12.dp), 60)
            ItensUnit(R.drawable.baiacu, "Baiacu", 5, Modifier.width(90.dp).height(80.dp), 60)
            ItensUnit(R.drawable.polvo, "Polvo", 15, Modifier.width(100.dp).height(80.dp).padding(start = 10.dp), 55)

        }
}
}
@Composable
fun BackgroundShop(){

    Box (modifier = Modifier.fillMaxSize()){
        Image(painterResource(R.drawable.backgroundshop), contentDescription = "papel de parede do mar", modifier=Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds )
    }

}
@Preview(showBackground=true, widthDp = 360, heightDp = 800)
@Composable
fun PreviewBackground(){
    BackgroundShop()
    TopLayout()
    SereiaBackground()
    ShopItens()
    Money()
}
