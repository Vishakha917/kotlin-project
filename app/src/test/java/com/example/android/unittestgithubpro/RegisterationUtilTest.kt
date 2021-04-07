package com.example.android.unittestgithubpro

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegisterationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegisterationUtil.validateRegisterationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username & correctly repeated pass returns true`() {
        val result = RegisterationUtil.validateRegisterationInput(
            "Vishakha",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegisterationUtil.validateRegisterationInput(
            "Chaitanya",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password empty returns false`() {
        val result = RegisterationUtil.validateRegisterationInput(
            "Chaitanya",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password doesn't match with confirmed pass returns false`() {
        val result = RegisterationUtil.validateRegisterationInput(
        "Chaitanya",
            "321",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`() {
        val result = RegisterationUtil.validateRegisterationInput(
            "Chaitanya",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }
}