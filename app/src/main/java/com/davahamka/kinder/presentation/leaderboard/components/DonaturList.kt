package com.davahamka.kinder.presentation.leaderboard.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.davahamka.kinder.static.DonaturDataStatic

@Composable
fun DonaturList() {
    LazyColumn() {
        item {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Level", color = Color(0xFF888484), fontWeight = FontWeight.Bold)
                Text(text = "Point", color = Color(0xFF888484), fontWeight = FontWeight.Bold)
            }
            DonaturDataStatic.dataCard.forEach {
                DonaturItem(it)
            }
        }
    }
}