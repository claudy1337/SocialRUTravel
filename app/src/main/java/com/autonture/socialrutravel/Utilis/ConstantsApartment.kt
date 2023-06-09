package com.autonture.socialrutravel.Utilis

import com.autonture.socialrutravel.R

object ConstantsApartment {
    fun getApartmentData():ArrayList<ApartmentClass> {
        val postList = ArrayList<ApartmentClass>()
        val post1 = ApartmentClass(1,  "Галеева 3","880055355", 2400, 4.5, R.drawable.flats_default_2)
        postList.add(post1)
        val post2 = ApartmentClass(2,  "Ленина 45","89271950599", 13200, 3.5, R.drawable.flats_default_1)
        postList.add(post2)
        val post3 = ApartmentClass(3,  "Шевченко 143","89658363173", 1100, 4.7, R.drawable.flats_default_3)
        postList.add(post3)
        val post4 = ApartmentClass(4,  "8Марта 15","89845743230", 800, 5.0, R.drawable.flats_default_4)
        postList.add(post4)
        val post5 = ApartmentClass(5,  "Гал","89564523699", 900, 3.9, R.drawable.flats_default_5)
        postList.add(post5)
        return postList
    }
}