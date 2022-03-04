package com.davahamka.kinder.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(bottomBar = { BottomNavigationBar(navController = navController)} ) {
        Column {
            BannerHome()
            DonateOrReceiveButton()

            Button(onClick = {
                navController.navigate(Screen.DonateScreen.route)
            }) {
                Text(text = "Donasi")
            }

            Button(onClick = {
                navController.navigate(Screen.CameraScreen.route)
            }) {
                Text(text = "Tes kamera")
            }
        }


    }
}