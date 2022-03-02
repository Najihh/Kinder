package com.davahamka.kinder.presentation.mission

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar

@Composable
fun MissionScreen(navController: NavController){
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

    }
}