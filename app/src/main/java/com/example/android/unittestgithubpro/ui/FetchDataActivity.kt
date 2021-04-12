package com.example.android.unittestgithubpro.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.android.unittestgithubpro.R
import com.example.android.unittestgithubpro.api.ApiClient
import com.example.android.unittestgithubpro.api.ApiInterface
import com.example.android.unittestgithubpro.databinding.ActivityFetchDataBinding
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FetchDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFetchDataBinding
    private val TAG = "FetchDataActivity"
    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fetch_data)

        recyclerView1 = binding.recyclerOne
        recyclerView2 = binding.recyclerOne

        callPost()
        callComment()
        callPhotos()
    }

    private fun callPhotos() {
        val commentInter: ApiInterface = ApiClient().getRetro().create(ApiInterface::class.java)
        val call: Call<List<ResponseBody>> = commentInter.getPhotos()

        call.enqueue(object : Callback<List<ResponseBody>> {
            override fun onResponse(
                call: Call<List<ResponseBody>>,
                response: Response<List<ResponseBody>>
            ) {

            }

            override fun onFailure(call: Call<List<ResponseBody>>, t: Throwable) {
                Log.e(TAG, "ERROR PHOTOS " + t.message)
            }

        })
    }

    private fun callComment() {
        val commentInter: ApiInterface = ApiClient().getRetro().create(ApiInterface::class.java)

        val call: Call<List<ResponseBody>> = commentInter.getComments()

        call.enqueue(object : Callback<List<ResponseBody>> {
            override fun onResponse(
                call: Call<List<ResponseBody>>,
                response: Response<List<ResponseBody>>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<ResponseBody>>, t: Throwable) {
                Log.e(TAG, "ERROR COMMENT " + t.message)
            }

        })
    }

    private fun callPost() {
        val commentInter: ApiInterface = ApiClient().getRetro().create(ApiInterface::class.java)
        val call: Call<List<ResponseBody>> = commentInter.getPhotos()

        call.enqueue(object : Callback<List<ResponseBody>> {
            override fun onResponse(
                call: Call<List<ResponseBody>>,
                response: Response<List<ResponseBody>>
            ) {
                recyclerView1.apply { }
            }

            override fun onFailure(call: Call<List<ResponseBody>>, t: Throwable) {
                Log.e(TAG, "ERROR POST " + t.message)
            }

        })
    }

}