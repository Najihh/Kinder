package com.davahamka.kinder.domain.repository

interface AuthRepository {

    suspend fun setLogin()

    suspend fun setRegister()

}