package com.kaori.android.data

import com.kaori.android.domain.model.Perfume

object MockPerfumes {
    val list = listOf(
        Perfume(
            id = 1,
            name = "...",
            brand = "...",
            family = "...",
            topNotes = listOf("flores blancas", "leche"),
            heartNotes = listOf("crema batida", "frambuesa"),
            baseNotes = listOf("ambroxán", "almizcle"),
            gender = "unisex",
            seasons = listOf("primavera", "otoño", "invierno"),
            rating = 4.5f,
            description = null
        ),
    )
}