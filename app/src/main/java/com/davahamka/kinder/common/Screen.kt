package com.davahamka.kinder.common

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splash_screen")

    // auth screen
    object LoginScreen: Screen("login_screen")
    object RegisterScreen: Screen("register_screen")
    object InformationScreen: Screen("information_screen")
    object UserPreferredScreen: Screen("auth_userpreferred_screen")
    object UserRestrictionScreen: Screen("auth_userrestriction_screen")

    object HomeScreen: Screen("home_screen")
    object MissionScreen: Screen("mission_screen")
    object MessageScreen: Screen("message_screen")
    object AccountScreen: Screen("account_screen")

    object DonateScreen: Screen("donate_screen")
    object CameraScreen: Screen("camera_screen")
    object DescriptionFormScreen: Screen("description_form_screen")
    object DonateMapScreen: Screen("donate_map_screen")
    object DonateConfirmationScreen: Screen("donate_confirmation_screen")

    object LeaderboardScreen: Screen("leaderboard_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
