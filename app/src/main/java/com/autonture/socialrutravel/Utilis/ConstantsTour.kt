package com.autonture.socialrutravel.Utilis

import com.autonture.socialrutravel.R

object ConstantsTour {
    fun getTourData():ArrayList<TourClass> {
        val postList = ArrayList<TourClass>()
        val post1 = TourClass(1,  "Казань", "Крупный город Российской Федерации, расположенный на реке Волге, столица Республики Татарстан", R.drawable.city_default)
        postList.add(post1)
        val post2 = TourClass(1,  "Москва", "Столица Российской Федерации, самый крупный по численности населения город страны и один из", R.drawable.city_default)
        postList.add(post2)
        val post3 = TourClass(1,  "Санкт-Петербу́рг", "Второй по численности населения город России, который часто называют «Северной столицей». ", R.drawable.city_default)
        postList.add(post3)
        val post4 = TourClass(1,  "Красноярск", "Один из крупнейших городов России, крупнейший экономический, образовательный и культурный центр Восточной Сибири.", R.drawable.city_default)
        postList.add(post4)
        val post5 = TourClass(1,  "Пермь", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.city_default)
        postList.add(post5)

        return postList
    }
}