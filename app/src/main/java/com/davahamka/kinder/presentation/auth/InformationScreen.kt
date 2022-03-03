package com.davahamka.kinder.presentation.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.theme.Black1

@Composable
fun InformationScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // TODO: Insert Kinder logo here
        
        Text(
            textAlign = TextAlign.Center,
            text = "Temukan Berbagai Kebaikan",
            fontWeight = FontWeight.Bold,
            color = Black1,
            fontSize = 16.sp
        )
        
        Spacer(modifier = Modifier.height(16.dp))

//        HorizontalPage

        Text(text = "Temukan Berbagai Kebaikan")
        
        Text(text = "Kemudahan ")
    }
}