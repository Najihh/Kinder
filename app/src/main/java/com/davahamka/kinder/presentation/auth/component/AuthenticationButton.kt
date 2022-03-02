package com.davahamka.kinder.presentation.auth.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.davahamka.kinder.presentation.ui.theme.Teal200

@Composable
fun AuthenticationButton(text: String, onClick: () -> Unit) {
    Button(onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Teal200,
            contentColor = Color.White
        ),
        contentPadding = PaddingValues(vertical = 12.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = text)
    }
}