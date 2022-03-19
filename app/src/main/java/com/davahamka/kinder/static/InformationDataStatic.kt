package com.davahamka.kinder.static

import androidx.compose.ui.graphics.painter.Painter
import com.davahamka.kinder.R

data class DataCard(
    val title: String,
    val description: String,
    val image: Int
)

object InformationDataStatic {
    val dataCard = listOf<DataCard>(
        DataCard(
            "Temukan Berbagai Kebaikan",
            description = "Kemudahan dalam menemukan target donasi " +
                    "dengan melakukan scan AI pada makanan dan " +
                    "memilih metode pengirimannya",
            image = R.drawable.img_information_one
            ),
        DataCard(
            "Berbagai Makanan Gratis",
            description = "Akses mudah dalam menemukan lokasi " +
                    "pembagian makanan gratis dari berbagai aksi " +
                    "kebaikan orang atau komunitas sosial",
            image = R.drawable.img_information_2
            ),
        DataCard(
            "Temukan Komoditas Murah",
            description = "Kemudahan dalam menemukan lokasi " +
                    "penjual komoditas makanan murah dengan " +
                    "berbagai makanan jadi dan mentah",
            image = R.drawable.img_information_three
        ),
    )
}