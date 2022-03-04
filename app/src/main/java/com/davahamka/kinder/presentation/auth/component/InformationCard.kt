package com.davahamka.kinder.presentation.auth.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davahamka.kinder.presentation.ui.theme.Black1
import com.davahamka.kinder.static.InformationDataStatic

@Composable
fun InformationCard(
    page: Int
) {
    Column(
        modifier = Modifier.height(290.dp)
    ) {
        Box(modifier = Modifier
            .width(155.dp)
            .height(155.dp)
            .background(Color.Black)
        ){
            
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            textAlign = TextAlign.Center,
            text = InformationDataStatic.dataCard[page].title,
            fontWeight = FontWeight.Bold,
            color = Black1,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = InformationDataStatic.dataCard[page].description,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 24.dp)
        )
    }
}