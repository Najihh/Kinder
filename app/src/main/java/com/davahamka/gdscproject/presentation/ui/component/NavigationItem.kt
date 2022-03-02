package com.davahamka.gdscproject.presentation.ui.component

import com.davahamka.gdscproject.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home: NavigationItem("home_screen", R.drawable.ic_launcher_background, "Beranda")
    object Mission: NavigationItem("mission_screen", R.drawable.ic_launcher_background, "Misi")
    object Message: NavigationItem("message_screen", R.drawable.ic_launcher_background, "Pesan")
    object Account: NavigationItem("account_screen", R.drawable.ic_launcher_background, "Akun")
}
