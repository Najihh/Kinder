package com.davahamka.kinder.presentation.donate.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.davahamka.kinder.presentation.ui.theme.Grey2

@Composable
fun QuantityPill() {
    Column(
        modifier = Modifier
            .background(color = Grey2, shape = RoundedCornerShape(24.dp))
            .width(64.dp)
            .height(37.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "1")
    }
    Spacer(modifier = Modifier.width(20.dp))
}