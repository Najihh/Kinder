package com.davahamka.kinder.presentation.account

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar

@Composable
fun AccountScreen(navController: NavController){
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

    }
}