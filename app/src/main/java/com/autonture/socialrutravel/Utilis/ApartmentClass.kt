package com.autonture.socialrutravel.Utilis

import android.os.Parcel
import android.os.Parcelable

data class ApartmentClass(val id:Int, val address:String, val ownerPhone:String, val price:Int, val rating:Double, val img:Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(address)
        parcel.writeString(ownerPhone)
        parcel.writeInt(price)
        parcel.writeDouble(rating)
        parcel.writeInt(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ApartmentClass> {
        override fun createFromParcel(parcel: Parcel): ApartmentClass {
            return ApartmentClass(parcel)
        }

        override fun newArray(size: Int): Array<ApartmentClass?> {
            return arrayOfNulls(size)
        }
    }


}
