package com.autonture.socialrutravel.Utilis

import android.os.Parcel
import android.os.Parcelable

data class TourClass(val id:Int, val name:String, val title:String, val img:Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(title)
        parcel.writeInt(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TourClass> {
        override fun createFromParcel(parcel: Parcel): TourClass {
            return TourClass(parcel)
        }

        override fun newArray(size: Int): Array<TourClass?> {
            return arrayOfNulls(size)
        }
    }

}