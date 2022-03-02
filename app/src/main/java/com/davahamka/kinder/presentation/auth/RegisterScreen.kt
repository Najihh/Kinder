package com.davahamka.kinder.presentation.auth

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
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
import com.davahamka.kinder.presentation.auth.component.AuthenticationButton

@Composable
fun RegisterScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(start = 24.dp, end = 24.dp, top = 88.dp)
    ) {
        Text(
            text = "Daftar",
            color= Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Akun Baru",
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
                Text("Nama Akun")
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
                Text("Kata Sandi")
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
                Text("Nomer Telepon")
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
            text = "Register",
            onClick = { Log.d("TES", "X")}
        )

        Spacer(modifier = Modifier.height(32.dp))
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Sudah memiliki akun?", color = Color.White)
            ClickableText(
                modifier = Modifier.padding(horizontal = 4.dp),
                onClick = { navController.popBackStack() },
                text = AnnotatedString("Masuk"),
                style = TextStyle(fontWeight = FontWeight.Bold, color = Color.White)
            )
        }

    }
}