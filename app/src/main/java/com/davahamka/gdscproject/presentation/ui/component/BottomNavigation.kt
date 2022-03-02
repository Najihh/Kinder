package com.davahamka.gdscproject.presentation.ui.component

import android.util.Log
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavController){
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Mission,
        NavigationItem.Message,
        NavigationItem.Account
    )

    BottomNavigation (
        backgroundColor = Color.Blue,
        contentColor = Color.White
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(painter =  painterResource(id =  item.icon), contentDescription = item.title )
                },
                label = { Text(text = item.title) },
                onClick = {
                          navController.navigate(item.route) {
                              navController.graph.startDestinationRoute?.let { route ->
                                  popUpTo(route) {
                                      saveState = true
                                  }
                              }
                          }
                },
                selected = currentRoute == item.route,
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f)
            )
        }
    }
}
