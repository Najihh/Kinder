package com.davahamka.kinder.domain.model

data class RegisterRequest (
    val email: String,
    val phoneNumber: String,
    val name: String,
    val password: String,
)