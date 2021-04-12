package com.example.android.unittestgithubpro.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainActivityViewmodel(application: Application) : AndroidViewModel(application) {

    fun testMethod() {
        viewModelScope.launch {

        }
    }
}