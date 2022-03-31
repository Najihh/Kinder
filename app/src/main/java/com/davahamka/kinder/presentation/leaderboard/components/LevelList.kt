package com.davahamka.kinder.presentation.leaderboard.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.davahamka.kinder.static.DonaturDataStatic
import com.davahamka.kinder.static.DonaturLevelDataStatic

@Composable
fun LevelList() {
    Column {
        DonaturLevelDataStatic.dataCard.forEach {
            LevelItem(it)
        }
    }
}