package com.example.android.unittestgithubpro

class EmailValidation {

    private val EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    fun email(email: String): Boolean {
        if (email.matches(EMAIL_PATTERN.toRegex()))
            return true
        return false
    }
}