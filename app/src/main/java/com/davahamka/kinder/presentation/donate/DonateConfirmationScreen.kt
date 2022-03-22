package com.davahamka.kinder.presentation.donate

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.davahamka.kinder.R
import com.davahamka.kinder.presentation.ui.theme.Black1
import com.davahamka.kinder.presentation.ui.theme.PrimaryColor

@Composable
fun DonateConfirmationScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Confirm if the recipient has received", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Black1)
        Text(text = "the donation you offered", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Black1)
        Spacer(modifier = Modifier.height(24.dp))
        Image(painter = painterResource(R.drawable.img_receive_confirmation), contentDescription = null)
        Spacer(modifier = Modifier.height(24.dp))
        Column() {
            CustomButton(text = "Has been sent", onClick = { /*TODO*/ })
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = PrimaryColor
                ),
                contentPadding = PaddingValues(vertical = 12.dp),
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = PrimaryColor, shape = RoundedCornerShape(25.dp)),
                onClick = {

                }
            ) {
                Text(text = "Back to Home")
            }
        }
    }
}