package com.davahamka.gdscproject.presentation.account

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.gdscproject.presentation.ui.component.BottomNavigationBar

@Composable
fun AccountScreen(navController: NavController){
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

    }
}