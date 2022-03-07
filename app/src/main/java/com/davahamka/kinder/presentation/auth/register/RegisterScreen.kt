package com.davahamka.kinder.presentation.auth.register

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.auth.component.AuthenticationButton
import com.davahamka.kinder.presentation.ui.theme.Black1
import com.davahamka.kinder.presentation.ui.theme.Grey2
import com.davahamka.kinder.presentation.ui.theme.PrimaryColor
import com.davahamka.kinder.presentation.ui.theme.White1
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun RegisterScreen(
    navController: NavController,
    viewModel: RegisterViewModel = hiltViewModel()
) {
    val systemUiController = rememberSystemUiController()

    SideEffect {

        systemUiController.setSystemBarsColor(
            color = White1,
        )

    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        item {
            Text(
                text = "Daftar",
                color= Black1,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 88.dp)
            )
            Text(
                text = "Akun Baru",
                color= Black1,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 36.dp)
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = viewModel.name,
                onValueChange = { viewModel.onEvent(event = RegisterEvent.OnChangeName(it))},
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Person, contentDescription = "")
                },
                placeholder = {
                    Text("Nama Akun")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Grey2,
                    focusedBorderColor = PrimaryColor
                ),
                shape = RoundedCornerShape(11.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                ,
                value = viewModel.email,
                onValueChange = { viewModel.onEvent(event = RegisterEvent.OnChangeEmail(it))},
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Email, contentDescription = "")
                },
                placeholder = {
                    Text("Email")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Grey2,
                    focusedBorderColor = PrimaryColor
                ),
                shape = RoundedCornerShape(11.dp)

            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                value = viewModel.phoneNumber,
                onValueChange = { viewModel.onEvent(event = RegisterEvent.OnChangePhoneNumber(it))},
                leadingIcon = {
                    Row(modifier = Modifier.background(color = Grey2)) {
                        Text(text = "🇮🇩")
                        Text(text = "+62")
                    }
                },
                placeholder = {
                    Text("Nomor handphone")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Grey2,
                    focusedBorderColor = PrimaryColor,
                ),
                shape = RoundedCornerShape(11.dp)
            )


            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                value = viewModel.password,
                onValueChange = { viewModel.onEvent(event = RegisterEvent.OnChangePassword(it))},
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Lock, contentDescription = "")
                },
                placeholder = {
                    Text("Kata sandi")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Grey2,
                    focusedBorderColor = PrimaryColor
                ),
                shape = RoundedCornerShape(11.dp)
            )


            Row(
                modifier = Modifier.padding(top = 16.dp, bottom = 24.dp).border(width = 2.dp, color = Grey2).clickable {  },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = viewModel.isConfirmPrivacyPolicy,
                    onCheckedChange = {
                        viewModel.onEvent(RegisterEvent.OnTogglePrivacyPolicy)
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = PrimaryColor
                    )
                )
                Text(text = "Dengan mendaftar, Anda telah menyetujui Ketentuan " +
                        "Pengguna dan Kebijakan Privasi", color = Black1,
                modifier = Modifier.padding(4.dp).clickable {  viewModel.onEvent(RegisterEvent.OnTogglePrivacyPolicy) })
            }

            AuthenticationButton(
                text = "Register",
                onClick = { navController.navigate(Screen.UserPreferredScreen.route) },
                isLoading = viewModel.state.value.isLoading
            )

            Spacer(modifier = Modifier.height(32.dp))
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Sudah memiliki akun?", color = Black1)
                ClickableText(
                    modifier = Modifier.padding(horizontal = 4.dp),
                    onClick = { viewModel.onEvent(RegisterEvent.NavigateToLogin(cb = {
                        navController.navigate(Screen.LoginScreen.route){
                            popUpTo(Screen.RegisterScreen.route) {
                                inclusive = true
                            }
                        }
                    })) },
                    text = AnnotatedString("Masuk"),
                    style = TextStyle(fontWeight = FontWeight.Bold, color = PrimaryColor)
                )
            }
        }


    }
}