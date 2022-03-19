package com.davahamka.kinder.presentation.mission

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar
import com.davahamka.kinder.presentation.ui.component.TopBarMission

@Composable
fun MissionScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopBarMission(title = "Misi")
        },
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

    }
}