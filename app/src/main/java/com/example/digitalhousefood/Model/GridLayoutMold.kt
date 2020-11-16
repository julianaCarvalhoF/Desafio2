package com.example.digitalhousefood.Model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GridLayoutMold (
    val imgGrid: String,
    val nameGrid: String,
    val explanation: String
) : Parcelable
