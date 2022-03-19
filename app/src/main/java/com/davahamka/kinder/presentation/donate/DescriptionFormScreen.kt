package com.davahamka.kinder.presentation.donate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.ui.component.TopBar
import com.davahamka.kinder.presentation.ui.component.TopBarDescription

@Composable
fun DescriptionFormScreen(navController: NavController) {
    Scaffold(
        topBar = { TopBarDescription(title = "Deskripsi Makanan") }
    ) {
        LazyColumn() {
            item {
                Column(
                    modifier = Modifier.padding(horizontal = 18.dp, vertical = 24.dp)
                ) {
                    Text(text = "Judul")
                    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp) ,placeholder = {
                        Text("Masukkan judul disini")
                    })
                    Text(text = "Deskripsi", modifier = Modifier.padding(top = 18.dp))
                    OutlinedTextField(value = "", onValueChange = {}, maxLines = 4, singleLine = false, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp), placeholder = {
                        Text(text = "Masukkan deskripsi")
                    })
                    Column(modifier = Modifier.padding(top = 64.dp)) {
                        CustomButton(text = "Lanjut", onClick = { navController.navigate(Screen.DonateMapScreen.route) })
                    }

                }

            }
        }
    }

}