package com.davahamka.kinder.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.davahamka.kinder.R
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.ui.theme.PrimaryColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    LaunchedEffect(key1 = true) {
        delay(3000L)
        navController.navigate(Screen.LoginScreen.route) {
            popUpTo(Screen.SplashScreen.route) {
                inclusive = true
            }
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_splash),
            contentDescription = "Logo"
        )
    }
}
