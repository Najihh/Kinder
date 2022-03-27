package com.davahamka.kinder.static

data class DonaturLevel(
    val image: String,
    val name: String,
    val point: Int
)

object DonaturLevelDataStatic {
    val dataCard = listOf(
        DonaturLevel("s", name = "Deputy God", point = 60000),
        DonaturLevel("s",  name = "The King", point = 35000),
        DonaturLevel("", name = "", point = 20000),
        DonaturLevel("", name = "The Savior", point = 10000),
        DonaturLevel("", name = "Generous Donor", point = 2000),
        DonaturLevel("", name = "Donation Pioneer", point = 2000),
        DonaturLevel("", name = "Donation Activist", point = 2000),
    )
}