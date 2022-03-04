package com.davahamka.kinder.data.api
import retrofit2.http.GET
import retrofit2.http.POST

interface KinderApi {

    @POST("/v1/auth/login")
    suspend fun setLogin()

    @POST("/auth/register")
    suspend fun setRegister()
}