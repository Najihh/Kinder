package com.davahamka.gdscproject.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DonateOrReceiveButton() {
    Box(modifier = Modifier.padding(horizontal = 18.dp)){
        Row() {
            Box(){
                Text(text = "Berdonasi")
            }
            Spacer(modifier = Modifier.width(4.dp))
            Box() {
                Text(text = "Mencari Donasi")
            }
        }
    } 
}