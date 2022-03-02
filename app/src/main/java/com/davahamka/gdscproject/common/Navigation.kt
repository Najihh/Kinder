package com.davahamka.gdscproject.common

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.davahamka.gdscproject.presentation.account.AccountScreen
import com.davahamka.gdscproject.presentation.auth.LoginScreen
import com.davahamka.gdscproject.presentation.auth.RegisterScreen
import com.davahamka.gdscproject.presentation.home.HomeScreen
import com.davahamka.gdscproject.presentation.message.MessageScreen
import com.davahamka.gdscproject.presentation.mission.MissionScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = Screen.LoginScreen.route) {
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