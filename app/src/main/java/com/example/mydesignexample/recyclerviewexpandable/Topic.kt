package com.example.mydesignexample.recyclerviewexpandable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Topic(
    val id: Int,
    val parentId: Int? = null,
    val level: Int? = null,
    val title: String? = null
) : Parcelable