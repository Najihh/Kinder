package com.davahamka.kinder.domain.usecase.auth

import com.davahamka.kinder.common.Resource
import com.davahamka.kinder.domain.model.LoginRequest
import com.davahamka.kinder.domain.model.LoginResponse
import kotlinx.coroutines.flow.Flow

interface AuthUseCases {
    fun setLogin(data: LoginRequest): Flow<Resource<LoginResponse>>
}
