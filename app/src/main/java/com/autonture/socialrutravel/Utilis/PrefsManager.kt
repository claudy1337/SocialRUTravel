package com.autonture.socialrutravel.Utilis

import android.content.Context
import com.google.gson.Gson

class PrefsManager (val context: Context) {
    private var prefs = context.getSharedPreferences("travel", Context.MODE_PRIVATE)


    fun saveList(list:MutableList<UserClass>){
        Gson().toJson(list)
        prefs.edit().putString("List",  Gson().toJson(list)).apply()
    }
}