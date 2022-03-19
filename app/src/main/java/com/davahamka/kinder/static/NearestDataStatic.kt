package com.davahamka.kinder.static

import androidx.compose.runtime.Composable

data class Nearest(
    val title: String,
    val name: String,
    val xp: Int,
    val condition: String,
    val imgUrl: String,
    val rating: Double,
    val location: Double
)

object NearestDataStatic {
    val dataCard = listOf<Nearest>(
        Nearest("Nasi Sate Kambing", "Pak Budi", 100, "Bagus", "gambar", 4.0, 5.0),
        Nearest("Buah Nanas Obral Murah", "Pak Agus", 50, "Bagus", "gambar", 4.0, 5.0),
        Nearest("Donasi Nasi Rendang", "Bu Sasi", 100, "Bagus", "ef", 4.0, 5.0),
        Nearest("Obral Sayur Sawi", "Pak Wisnu Kuncoro", 100, "Layak", "ef", 4.0, 5.0),
        Nearest("Nasi Sate Kambing", "Pak Budi", 100, "Bagus", "gambar", 4.0, 5.0),
    )
}