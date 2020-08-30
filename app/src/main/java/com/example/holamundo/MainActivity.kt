package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity() : AppCompatActivity(), android.os.Parcelable {
    constructor(parcel: android.os.Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun writeToParcel(parcel: android.os.Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : android.os.Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: android.os.Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}