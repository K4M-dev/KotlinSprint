package org.example.lesson_22

data class Player223(
    val name223: String,
    val hp: Int,
    val power: Int,
)

fun main() {

    val player1 = Player223("Guest", 100, 30)
    val (name, hp, power) = player1
    println(name)
    println(hp)
    println(power)
}