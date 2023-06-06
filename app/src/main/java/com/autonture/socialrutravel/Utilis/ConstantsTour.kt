package com.autonture.socialrutravel.Utilis

import com.autonture.socialrutravel.R

object ConstantsTour {
    fun getTourData():ArrayList<TourClass> {
        val postList = ArrayList<TourClass>()
        val post1 = TourClass(1,  "Большая Норва", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.city_default)
        postList.add(post1)
        val post2 = TourClass(1,  "Норва", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.city_default)
        postList.add(post2)
        val post3 = TourClass(1,  "Nsdf", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.city_default)
        postList.add(post3)
        val post4 = TourClass(1,  "Тыва", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.city_default)
        postList.add(post4)
        val post5 = TourClass(1,  "Сапора", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.city_default)
        postList.add(post5)

        return postList
    }
}