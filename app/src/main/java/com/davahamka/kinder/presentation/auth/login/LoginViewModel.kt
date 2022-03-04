package com.davahamka.kinder.presentation.auth.login

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(

): ViewModel() {

    private val _state = mutableStateOf(LoginState())
    val state: State<LoginState> = _state

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    fun onEvent(event: LoginEvent) {
        when(event) {
            is LoginEvent.OnChangeEmail -> {
                email = event.email
            }
            is LoginEvent.OnChangePassword -> {
                password = event.password
            }
            is LoginEvent.NavigateToRegister -> {
                event.cb()
            }
            is LoginEvent.OnSubmitLogin -> {
                // TODO: Call API Login
//                _state.value.isLoading = true

            }
        }
    }
}