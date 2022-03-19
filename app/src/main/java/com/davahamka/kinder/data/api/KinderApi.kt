package com.davahamka.kinder.data.api
import com.davahamka.kinder.common.Resource
import com.davahamka.kinder.domain.model.LoginRequest
import com.davahamka.kinder.domain.model.LoginResponse
import com.davahamka.kinder.domain.model.RegisterRequest
import com.davahamka.kinder.domain.model.RegisterResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST

interface KinderApi {

    // auth
    @POST("/auth/login")
    suspend fun setLogin(@Body data: LoginRequest): Flow<Resource<LoginResponse>>

    @POST("/user/register")
    suspend fun setRegister(@Body data: RegisterRequest): Flow<Resource<RegisterResponse>>

    @POST("/user/:id")
    suspend fun updateUser(@Body s: String)

    @DELETE("/user/:id")
    suspend fun deleteUser()

    // donate

}