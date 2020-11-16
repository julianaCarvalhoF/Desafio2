package com.example.digitalhousefood.Model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CardMold (
    val cardImage: String,
    val cardName: String,
    val cardDescription: String,
    val cardStatus: String,
    val menu: MutableList<GridLayoutMold>
    ): Parcelable
