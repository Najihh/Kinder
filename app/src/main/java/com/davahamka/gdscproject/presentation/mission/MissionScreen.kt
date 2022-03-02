package com.davahamka.gdscproject.presentation.mission

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.gdscproject.presentation.ui.component.BottomNavigationBar

@Composable
fun MissionScreen(navController: NavController){
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

    }
}