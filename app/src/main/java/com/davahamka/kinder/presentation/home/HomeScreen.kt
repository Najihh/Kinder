package com.davahamka.kinder.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(bottomBar = { BottomNavigationBar(navController = navController)} ) {
        Column {
            BannerHome()
            DonateOrReceiveButton()
        }


    }
}