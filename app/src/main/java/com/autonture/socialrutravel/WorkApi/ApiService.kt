package com.autonture.socialrutravel.WorkApi

import com.autonture.socialrutravel.WorkApi.Models.Towns
import com.autonture.socialrutravel.WorkApi.Models.Users
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("user/Users/{id}")
    suspend fun getUser(@Path("id") id:Int):Response<Users>

    @GET("Towns/{id}")
    suspend fun getTownId(@Path("id") id:Int):Response<Towns>

    @GET("Towns/")
    suspend fun getTowns(): List<Towns>
}