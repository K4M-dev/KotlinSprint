package org.example.lesson_20

class Player20(
    val name: String,
    var currentHP: Int,
    private val maxHP: Int = 100,
) {
    fun useHpFlask(): String {
        currentHP = maxHP
        return "Игрок $name, использовал исцелительную колбу и теперь имеет $currentHP hp"
    }
}

fun main() {

    val player1 = Player20("Guardian", 45)
    println("Текущеее здоровье ${player1.currentHP} hp")

    val hpFlask: (Player20) -> String = { player -> player.useHpFlask() }
    println(hpFlask(player1))

    println("Теперь текущее здоровье: ${player1.currentHP} hp")
}