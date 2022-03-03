package com.davahamka.kinder.common

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.davahamka.kinder.presentation.SplashScreen
import com.davahamka.kinder.presentation.account.AccountScreen
import com.davahamka.kinder.presentation.auth.LoginScreen
import com.davahamka.kinder.presentation.auth.RegisterScreen
import com.davahamka.kinder.presentation.home.HomeScreen
import com.davahamka.kinder.presentation.message.MessageScreen
import com.davahamka.kinder.presentation.mission.MissionScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = Screen.SplashScreen.route) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }

        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        composable(route = Screen.MissionScreen.route) {
            MissionScreen(navController = navController)
        }

        composable(route = Screen.MessageScreen.route) {
            MessageScreen(navController = navController)
        }

        composable(route = Screen.AccountScreen.route) {
            AccountScreen(navController = navController)
        }
    }
}