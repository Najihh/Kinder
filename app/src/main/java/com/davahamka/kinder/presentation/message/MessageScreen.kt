package com.davahamka.kinder.presentation.message

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar

@Composable
fun MessageScreen(navController: NavController) {
    Scaffold(bottomBar = { BottomNavigationBar( navController = navController) }) {

    }
}