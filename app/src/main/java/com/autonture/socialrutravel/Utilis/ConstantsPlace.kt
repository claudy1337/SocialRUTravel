package com.autonture.socialrutravel.Utilis

import com.autonture.socialrutravel.R

object ConstantsPlace {
    fun getPlaceData():ArrayList<PlaceClass> {
        val postList = ArrayList<PlaceClass>()
        val post1 = PlaceClass(1,  "Садира", R.drawable.place_default3)
        postList.add(post1)
        val post2 = PlaceClass(1,  "Авро", R.drawable.place_default3)
        postList.add(post2)
        val post3 = PlaceClass(1,  "Мопач", R.drawable.place_default3)
        postList.add(post3)
        val post4 = PlaceClass(1,  "Киравы", R.drawable.place_default3)
        postList.add(post4)
        val post5 = PlaceClass(1,  "Малентка Авро", R.drawable.place_default3)
        postList.add(post5)

        return postList
    }
}