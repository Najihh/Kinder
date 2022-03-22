package com.davahamka.kinder.presentation.message.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.davahamka.kinder.static.messageDataStatic

@Composable
fun ListMessage() {
    LazyColumn() {
        item {
            messageDataStatic.dataCard.forEach {
                ItemMessage(it)
            }
        }
    }
}