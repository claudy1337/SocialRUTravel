package com.autonture.socialrutravel.Utilis

import com.autonture.socialrutravel.R

object ConstantsPost {
    fun getPostData():ArrayList<PostClass> {
        val postList = ArrayList<PostClass>()
        val post1 = PostClass("1",  "Aboba Boba", "aboba_boba", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.backround_image)
        postList.add(post1)
        val post2 = PostClass("2",  "Dima Doma", "aboba_boba", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.backround_image2)
        postList.add(post2)
        val post3 = PostClass("3",  "Biba Ravil", "aboba_boba", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.backround_image2)
        postList.add(post3)
        val post4 = PostClass("4",  "Shmoney Boba", "aboba_boba", "Внезапно, представители современных социальных резервов преданы социально-демократической анафеме...", R.drawable.backround_image)
        postList.add(post4)

        return postList
    }
}