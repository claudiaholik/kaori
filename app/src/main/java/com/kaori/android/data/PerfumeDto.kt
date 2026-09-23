package com.kaori.android.data

import com.google.gson.annotations.SerializedName

data class Perfume(
    val id: Int,
    val name: String,
    val brand: String,
    val family: String,
    @SerializedName("notes_top") val notesTop: List<String>,
    @SerializedName("notes_heart") val notesHeart: List<String>,
    @SerializedName("notes_base") val notesBase: List<String>,
    @SerializedName("gender") val targetGender: String,
    val season: List<String>,
    @SerializedName("price_eur") val priceEur: Double,
    val description: String?

)