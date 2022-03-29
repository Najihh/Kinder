package com.davahamka.kinder.domain.usecase.auth

import com.davahamka.kinder.common.Resource
import com.davahamka.kinder.domain.model.LoginRequest
import com.davahamka.kinder.domain.model.LoginResponse
import com.davahamka.kinder.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow

class LoginAuth(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(loginRequest: LoginRequest): Flow<Resource<LoginResponse>> {
        return repository.setLogin(loginRequest)
    }
}