package com.autonture.socialrutravel.WorkApi

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WorkApi {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://impervm-001-site1.atempurl.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}