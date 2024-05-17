package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clase_1_jetpack_compose.R
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.contentColorFor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun Main(){
    Box (modifier = Modifier.fillMaxSize()){
        Content()
    }
}

@Composable
fun Content(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
/*
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Image(R.drawable.img)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Texto()
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Image(R.drawable.img_1)
        }

 */
        Filas(R.drawable.img, "###")
        Text(text = "Hellouda", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 20.sp)
        Button(onClick = { /*TODO*/ }/*, colors = ButtonColors(contentColorFor(Color.Red))*/) {
            Text(text = "Boton chingon", fontSize = 20.sp)
        }
        Filas(R.drawable.img_1, "###")
    }
}
/*
@Composable
fun Image(data: Int){
    Image(
        painter = painterResource(id = data),
        contentDescription = null,
        modifier = Modifier.size(width = 200.dp, height = 200.dp),
    )
}

@Composable
fun Texto(){
    Text(text = "Hola")
}
*/

@Composable
fun Filas(
    img: Int,
    descripcion: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
        .width(450.dp)
        .height(200.dp)
){
    Row(modifier = modifier, horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource( id = img ), contentDescription = descripcion, modifier = imgModifier )
    }
}
@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewPactica1(){
    Main()
}