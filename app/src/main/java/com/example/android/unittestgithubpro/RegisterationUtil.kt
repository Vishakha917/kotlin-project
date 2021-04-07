package com.example.android.unittestgithubpro

object RegisterationUtil {

    private val existingUsers = listOf("Chaitanya", "Nityananda")

    /** the input is not valid... if username is empty or already taken... if confirm pass != pass
     * pass contains less than 2 digits... **/

    fun validateRegisterationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) { // existingUsers.contains(username)
            return false
        }
        if (password.count { it.isDigit() } < 2) { //password.length < 2
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        return true
    }
}