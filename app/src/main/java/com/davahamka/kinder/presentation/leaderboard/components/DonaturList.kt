package com.davahamka.kinder.presentation.leaderboard.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.davahamka.kinder.static.DonaturDataStatic

@Composable
fun DonaturList() {
    LazyColumn() {
        item {
            DonaturDataStatic.dataCard.forEach {
                DonaturItem(it)
            }
        }
    }
}