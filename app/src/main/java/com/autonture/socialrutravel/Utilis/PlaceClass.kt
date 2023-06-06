package com.autonture.socialrutravel.Utilis

import android.os.Parcel
import android.os.Parcelable

data class PlaceClass(val id:Int, val name:String, val img:Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeInt(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlaceClass> {
        override fun createFromParcel(parcel: Parcel): PlaceClass {
            return PlaceClass(parcel)
        }

        override fun newArray(size: Int): Array<PlaceClass?> {
            return arrayOfNulls(size)
        }
    }

}