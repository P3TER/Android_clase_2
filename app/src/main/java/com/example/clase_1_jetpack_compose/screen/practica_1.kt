package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Main(){
    Box (modifier = Modifier.fillMaxSize()){
        Content()
    }
}

@Composable
fun Content(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Image_1()
        Texto()
        Image_1()
    }
}

@Composable
fun Image_1(){
    Image(imageVector = , contentDescription = "") {

    }
}

@Composable
fun Texto(){

}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain(){
    Main()
}