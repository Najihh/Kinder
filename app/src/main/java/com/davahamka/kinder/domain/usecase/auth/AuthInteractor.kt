package com.davahamka.kinder.domain.usecase.auth

import com.davahamka.kinder.common.Resource
import com.davahamka.kinder.domain.model.LoginRequest
import com.davahamka.kinder.domain.model.LoginResponse
import com.davahamka.kinder.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow

class AuthInteractor (private val authRepository: AuthRepository){
    suspend fun setLogin(data: LoginRequest): Flow<Resource<LoginResponse>> = authRepository.setLogin(data)
}