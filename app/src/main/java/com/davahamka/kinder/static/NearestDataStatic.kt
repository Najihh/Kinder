package com.davahamka.kinder.static

import androidx.compose.runtime.Composable
import com.google.android.gms.maps.model.LatLng

data class Nearest(
    val title: String,
    val name: String,
    val xp: Int,
    val condition: String,
    val imgUrl: String,
    val rating: Double,
    val location: Double,
    val position: LatLng
)

object NearestDataStatic {
    val dataCard = listOf<Nearest>(
        Nearest("Nasi Sate Kambing", "Pak Budi", 100, "Good", "https://awsimages.detik.net.id/community/media/visual/2021/03/06/sate-pak-heri-asli-2.jpeg?w=700&q=90", 4.0, 5.0, position = LatLng(-7.9354264,112.6239592)),
        Nearest("Buah Nanas Obral Murah", "Pak Agus", 50, "Good", "https://asset.kompas.com/crops/yC1HTVBUaikv5UKiqJHdferO26s=/192x128:1728x1152/750x500/data/photo/2021/07/31/6104430e3b137.jpg", 4.0, 5.0, position = LatLng(-7.9354264,112.6239592)),
        Nearest("Donasi Nasi Rendang", "Bu Sasi", 100, "Good", "https://assets.pikiran-rakyat.com/crop/74x12:890x646/x/photo/2021/03/28/2173660325.jpg", 4.0, 5.0, position = LatLng(-7.9354264,112.6239592)),
        Nearest("Obral Sayur Sawi", "Pak Wisnu Kuncoro", 100, "Worth", "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2020/5/29/ff339c1c-7516-4e46-8f9c-9edd1d81f495.png", 4.0, 5.0, position = LatLng(-7.9354264,112.6239592)),
        Nearest("Nasi Sate Kambing", "Pak Budi", 100, "Good", "https://awsimages.detik.net.id/community/media/visual/2021/03/06/sate-pak-heri-asli-2.jpeg?w=700&q=90", 4.0, 5.0, position = LatLng(7.9354264,112.6239592)),
    )
}