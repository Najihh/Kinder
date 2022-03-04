package com.davahamka.kinder.static

data class DataCard(
    val title: String,
    val description: String
)

object InformationDataStatic {
    val dataCard = listOf<DataCard>(
        DataCard(
            "Temukan Berbagai Kebaikan",
            description = "Kemudahan dalam menemukan target donasi " +
                    "dengan melakukan scan AI pada makanan dan " +
                    "memilih metode pengirimannya"),
        DataCard(
            "Berbagai Makanan Gratis",
            description = "Akses mudah dalam menemukan lokasi " +
                    "pembagian makanan gratis dari berbagai aksi " +
                    "kebaikan orang atau komunitas sosial"),
        DataCard(
            "Temukan Komoditas Murah",
            description = "Kemudahan dalam menemukan lokasi " +
                    "penjual komoditas makanan murah dengan " +
                    "berbagai makanan jadi dan mentah"),
    )
}