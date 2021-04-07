
package com.example.android.unittestgithubpro

import org.junit.Before
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class EmailValidationTest {

    private lateinit var validation: EmailValidation

    @Before
    fun setUp() {
        validation = EmailValidation()
    }

    @Test
    fun checkEmail() {
        val result = validation.email("test@g")
        assertThat(result).isFalse()
    }


}