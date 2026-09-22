package com.kaori.android.domain.model

data class Perfume (
    val id: Int,
    val nombre: String,
    val marca: String,
    val familia: String,
    val notas: List<String>,
    val valoracion: Float
)