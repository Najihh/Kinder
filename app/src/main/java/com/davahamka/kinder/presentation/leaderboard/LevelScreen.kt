package com.davahamka.kinder.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.component.TopBarMission

@Composable
fun LevelScreen(navController: NavController) {
    Scaffold(
        topBar = { TopBarMission(title = "Level") }
    ) {
        LazyColumn() {
            item {
                Column() {
                    Text(text = "Donation Warrior")
                    Text(text = "Total points earned 700 XP")
                    Text(text = "100 XP to Donate Booster")
                    Text(text = "Start and go, follow the mission to reach 100 XP")
                }
            }
        }
    }
}