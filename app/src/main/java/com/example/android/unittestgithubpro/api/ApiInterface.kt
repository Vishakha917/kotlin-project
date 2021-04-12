package com.example.android.unittestgithubpro.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("/posts")
    fun getPosts() : Call<List<ResponseBody>>

    @GET("/comments")
    fun getComments() : Call<List<ResponseBody>>

    @GET("/photos")
    fun getPhotos() : Call<List<ResponseBody>>
}