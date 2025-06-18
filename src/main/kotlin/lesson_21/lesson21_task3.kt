package org.example.lesson_21

class Player21(
    val name: String,
    var currentHP: Int,
    val maxHP: Int = 100,
)

fun Player21.isHealthy(): Boolean {
    return currentHP == maxHP
}

fun main() {

    val player1 = Player21("Guardian", 100)
    println("Текущее здоровье ${player1.currentHP} hp")

    println(player1.isHealthy())
}