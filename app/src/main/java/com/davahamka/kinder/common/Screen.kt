package com.davahamka.kinder.common

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splash_screen")
    object LoginScreen: Screen("login_screen")
    object RegisterScreen: Screen("register_screen")
    object HomeScreen: Screen("home_screen")
    object MissionScreen: Screen("mission_screen")
    object MessageScreen: Screen("message_screen")
    object AccountScreen: Screen("account_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
