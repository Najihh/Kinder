package com.davahamka.kinder.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.ui.component.BottomNavigationBar
import com.davahamka.kinder.presentation.ui.component.TopBar
import com.davahamka.kinder.presentation.ui.theme.PrimaryColor
import com.davahamka.kinder.presentation.ui.theme.White1
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(navController: NavController?) {

    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setSystemBarsColor(
            color = PrimaryColor,
        )
    }


    Scaffold(topBar = {
                TopBar()
    },bottomBar = { BottomNavigationBar(navController = navController!!)} ) {
        LazyColumn {
            item {
                BannerHome()
                DonateOrReceiveButton()

                Button(onClick = {
                    navController?.navigate(Screen.DonateScreen.route)
                }) {
                    Text(text = "Donasi")
                }

                Button(onClick = {
                    navController?.navigate(Screen.CameraScreen.route)
                }) {
                    Text(text = "Tes kamera")
                }
            }
        }


    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = null)
}