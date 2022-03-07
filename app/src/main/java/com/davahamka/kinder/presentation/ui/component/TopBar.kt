package com.davahamka.kinder.presentation.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.davahamka.kinder.presentation.ui.theme.PrimaryColor
import com.davahamka.kinder.presentation.ui.theme.White1

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .background(color = PrimaryColor)
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(64.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "100 point", color = White1)
        Text(text = "100 point", color = White1)
        Text(text = "100 point", color = White1)
    }
}