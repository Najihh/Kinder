package com.davahamka.gdscproject.presentation.message

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.gdscproject.common.Screen
import com.davahamka.gdscproject.presentation.ui.component.BottomNavigationBar

@Composable
fun MessageScreen(navController: NavController) {
    Scaffold(bottomBar = { BottomNavigationBar( navController = navController) }) {

    }
}