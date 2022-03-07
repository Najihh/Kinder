package com.davahamka.kinder.common

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.davahamka.kinder.presentation.SplashScreen
import com.davahamka.kinder.presentation.account.AccountScreen
import com.davahamka.kinder.presentation.auth.InformationScreen
import com.davahamka.kinder.presentation.auth.login.LoginScreen
import com.davahamka.kinder.presentation.auth.register.RegisterScreen
import com.davahamka.kinder.presentation.auth.user_preferred.UserPreferredScreen
import com.davahamka.kinder.presentation.auth.user_preferred.UserRestrictionScreen
import com.davahamka.kinder.presentation.donate.CameraScreen
import com.davahamka.kinder.presentation.donate.DonateScreen
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

        composable(route = Screen.UserPreferredScreen.route) {
            UserPreferredScreen(navController = navController)
        }

        composable(route = Screen.UserRestrictionScreen.route) {
            UserRestrictionScreen(navController = navController)
        }
        
        composable(route = Screen.InformationScreen.route) {
            InformationScreen(navController = navController)
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

        composable(route = Screen.DonateScreen.route) {
            DonateScreen()
        }

        composable(route = Screen.CameraScreen.route) {
            CameraScreen()
        }
    }
}