package com.example.android.unittestgithubpro.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.unittestgithubpro.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var number: Int? = null
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (number != null)
//            val number2 = number + 1

        //REPLACEMENT OF ABOVE CODE
        val x = number?.let {
            val num2 = it + 1
            num2 // let by default returns the last of let block.
        } ?: 3 //defualt value.


//        //It will delay the main thread and will block the UI
//        runBlocking {
//            delay(100L)
//        }

//        val jskljk = findViewById<TextView>(R.id.tvDummy)
//        GlobalScope.launch(Dispatchers.IO) {
//            Log.d(TAG, "Coroutine  thread ${Thread.currentThread().name}")
//            val answer = doNetworkCall()
//            withContext(Dispatchers.Main) {
//                Log.d(TAG, "Setting text in the thread ${Thread.currentThread().name}")
//                jskljk.text = answer
//            }
//        }


        //This is called as Producer in Kotlin Flow.
        val flow = flow {
            for (i in 1..10) {
                emit(i)
                delay(1000L)
            }
        }

        //This is called as Consumer in Kotlin Flow
        GlobalScope.launch {
            flow.buffer().filter {
                it % 2 == 0
            }.map {
                it * it
            }.collect {
                println(it)
                delay(2000L)
            }
        }

//        GlobalScope.launch(newSingleThreadContext("MyThread")) {
////            delay(5000L)
////            Log.d(TAG, "Coroutine says hello from the thread ${Thread.currentThread().name}")
//
//            val networkCallAnswer = doNetworkCall()
//            val networkCallAnswer2 = doNetworkCall2()
//            Log.d(TAG, "${Thread.currentThread().name} "+networkCallAnswer)
//
//            Log.d(TAG, "${Thread.currentThread().name} "+networkCallAnswer)
//        }

//        Log.d(TAG, "Hello from the thread ${Thread.currentThread().name}")
    }

    fun getSquareOfNum() = (i * i).also { i++ }

    //fun getSquareOfNums() = (i * i).also { it++ } //Here `it` will return (i*i)

    suspend fun doNetworkCall(): String {
        delay(3000L)
        return "This is the answer"
    }

    suspend fun doNetworkCall2(): String {
        delay(3000L)
        return "This is the answer"
    }

    fun checkNum(num: Int): Boolean {
        if (num == 2)
            return true
        return false
    }

}