package com.davahamka.gdscproject.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.gdscproject.presentation.ui.component.BottomNavigationBar

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(bottomBar = { BottomNavigationBar(navController = navController)} ) {
        Column {
            BannerHome()
            DonateOrReceiveButton()
        }


    }
}