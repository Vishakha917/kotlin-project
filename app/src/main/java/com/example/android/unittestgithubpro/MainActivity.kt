package com.example.android.unittestgithubpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun checkNum(num: Int): Boolean {
        if (num == 2)
            return true
        return false
    }

}