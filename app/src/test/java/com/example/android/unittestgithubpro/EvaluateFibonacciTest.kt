package com.example.android.unittestgithubpro

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class EvaluateFibonacciTest {
    @Test
    fun validateFibonacci() {
        val result = EvaluateFibonacci.fib(2)
//        assertThat(result).isFalse()
    }
}