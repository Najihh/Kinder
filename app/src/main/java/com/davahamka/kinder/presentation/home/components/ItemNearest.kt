package com.davahamka.kinder.presentation.home.components

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davahamka.kinder.presentation.ui.theme.*

@Composable
fun ItemNearest() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .height(120.dp),
        elevation = 2.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Gambar")
            Column(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Text(text = "Nasi Sate Kambing", color= Black1, fontWeight = FontWeight.Bold, fontSize = 15.sp, modifier = Modifier.padding(bottom = 2.dp))
                Text(text = "Pak Budi", color = Grey1, fontWeight = FontWeight.SemiBold, fontSize= 12.sp)
                Row(
                    modifier = Modifier.padding(top = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(imageVector = Icons.Filled.Star,
                        tint = Orange2,
                        contentDescription = null, modifier = Modifier.size(12.dp))
                    Text(text = "4.5", fontSize = 12.sp)
                    Text(text = "0.5 KM",fontSize = 12.sp, modifier = Modifier.padding(start = 12.dp))
                }
            }
            Column(
                modifier = Modifier.fillMaxHeight().padding(top = 10.dp, bottom = 10.dp, end = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.End
            ) {
                Box(modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0XFF2F9A49).copy(0.2f))){
                    Text(text = "100XP", color = Green3, fontWeight = FontWeight.SemiBold , modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 4.dp))
                }
                Text(text = "Kondisi Bagus", color = Green3, fontWeight = FontWeight.SemiBold)
            }
        }
    }
    Spacer(modifier = Modifier.height(24.dp))
}