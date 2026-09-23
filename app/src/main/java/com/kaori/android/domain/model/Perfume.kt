package com.kaori.android.domain.model

data class Perfume(
    val id: Int,
    val name: String,
    val brand: String,
    val family: String,
    val topNotes: List<String>,
    val heartNotes: List<String>,
    val baseNotes: List<String>,
    val gender: String,
    val seasons: List<String>,
    val rating: Float,
    val description: String?
)