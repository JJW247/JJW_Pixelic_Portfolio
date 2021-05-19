package com.mapo.walkaholic.data.model.response

data class AuthResponse(
    val code: String,
    val message: String,
    val data: LoginData?
) {
    inner class LoginData(
        val userId: Long
    )
}