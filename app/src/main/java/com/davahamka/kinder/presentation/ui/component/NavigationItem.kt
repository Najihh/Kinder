package com.davahamka.kinder.presentation.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.davahamka.kinder.R

sealed class NavigationItem(
    var route: String,
    var icon: ImageVector,
    var iconSelected: ImageVector,
    var title: String) {
    object Home: NavigationItem("home_screen", Icons.Outlined.Home, Icons.Filled.Home, title= "Beranda")
    object Mission: NavigationItem("mission_screen", Icons.Filled.ChatBubble, Icons.Filled.Home, title = "Misi")
    object Message: NavigationItem("message_screen", Icons.Outlined.ChatBubble, Icons.Filled.ChatBubble, title = "Pesan")
    object Account: NavigationItem("account_screen", Icons.Outlined.Person,  Icons.Filled.Person, title = "Akun")
}
