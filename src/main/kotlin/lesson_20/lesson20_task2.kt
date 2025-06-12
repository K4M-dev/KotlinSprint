package org.example.lesson_20

class Player20(
    val name: String,
    var currentHP: Int,
    val maxHP: Int = 100,
)

fun main() {

    val player1 = Player20("Guardian", 45)
    println("Текущеее здоровье ${player1.currentHP} hp")

    val hpFlask: (Player20) -> String = { player ->
        player.currentHP = player.maxHP
        "Игрок ${player.name}, использовал исцелительную колбу и теперь имеет ${player.currentHP} hp"
    }
    println(hpFlask(player1))

    println("Теперь текущее здоровье: ${player1.currentHP} hp")
}