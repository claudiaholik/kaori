package com.kaori.android.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class gPerfumeDto(
    val id: Int,
    val name: String,
    val brand: String,
    val family: String,
    @SerialName("notes_top") val notesTop: List<String>,
    @SerialName("notes_heart") val notesHeart: List<String>,
    @SerialName("notes_base") val notesBase: List<String>,
    @SerialName("gender") val targetGender: String,
    val season: List<String>,
    @SerialName("price_eur") val priceEur: Double,
    val description: String?

)