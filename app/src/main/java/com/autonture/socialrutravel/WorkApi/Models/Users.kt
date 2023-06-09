package com.autonture.socialrutravel.WorkApi.Models

data class Users(
    val Id: Int? = null,
    val name:String,
    val surname:String,
    val email:String,
    val countOfTravels:Int? = null,
    val rating:Int? = null,
    val townsRefID:Int
)
