package com.autonture.socialrutravel.Utilis

import android.media.Image
import android.os.Parcel
import android.os.Parcelable

data class PostClass(val token:String, val userName:String, val userLogin:String, val title:String, val image: Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(token)
        parcel.writeString(userName)
        parcel.writeString(userLogin)
        parcel.writeString(title)
        parcel.writeInt(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PostClass> {
        override fun createFromParcel(parcel: Parcel): PostClass {
            return PostClass(parcel)
        }

        override fun newArray(size: Int): Array<PostClass?> {
            return arrayOfNulls(size)
        }
    }

}