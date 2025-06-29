package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: LocalDateTime,
    val distance: Double,
)

fun main() {

    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая звёздная система к Земле",
        LocalDateTime.of(2024, 6, 15, 14, 30),
        4.37,
    )

    println(alphaCentauri.component1())
    println(alphaCentauri.component2())
    println(alphaCentauri.component3())
    println(alphaCentauri.component4())
}