package com.davahamka.kinder.presentation.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.auth.component.AuthenticationButton

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(start = 24.dp, end = 24.dp, top = 120.dp)
    ) {
        Text(
            text = "Masuk",
            color= Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 36.dp)
        )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.MailOutline, contentDescription = "")
                },
                placeholder = {
                    Text("Email")
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                ,
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Lock, contentDescription = "")
                },
                placeholder = {
                    Text("Password")
                }
            )


        Row(modifier = Modifier.fillMaxWidth().padding(top = 6.dp), horizontalArrangement = Arrangement.End, ) {
            ClickableText(
                onClick = {  },
                modifier = Modifier.fillMaxWidth(),
                text = AnnotatedString("Lupa password?"),
                style = TextStyle(color = Color.White, textAlign = TextAlign.Right, fontWeight = FontWeight.Bold),
                )
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        AuthenticationButton(
            text = "Masuk",
            onClick = { navController.navigate(Screen.HomeScreen.withArgs())}
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Belum memiliki akun?", color = Color.White)
            ClickableText(
                modifier = Modifier.padding(horizontal = 4.dp),
                onClick = { navController.navigate(Screen.RegisterScreen.withArgs()) },
                text = AnnotatedString("Daftar"),
                style = TextStyle(fontWeight = FontWeight.Bold, color = Color.White)
            )
        }

    }
}