package com.example.responsi1607

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DaftarMenu (
    val imgMenu: Int,
    val Title: String,
    val Subtitle: String
        ): Parcelable