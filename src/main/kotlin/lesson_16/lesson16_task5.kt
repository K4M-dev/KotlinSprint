package org.example.lesson_16

class Player(
    private val name: String,
    internal var health: Int,
    private var attackPower: Int,
) {

    fun damage(): Int {
        val enemyAttackPower = 90
        println("Игроку $name нанесено $enemyAttackPower урона")
        health -= enemyAttackPower
        println("Осталось здоровья $health")
        return health
    }

    fun healing(): Int {
        health += HEALING_FLASK
        println("Игрок $name выпил лечебную колбу и получил +$HEALING_FLASK hp")
        println("Здровья $health hp")
        return health
    }

    private fun death(): String {
        attackPower = 0
        return "Игрок $name погиб в бою"
    }

    fun getDeath() = println(death())
}

fun main() {

    val player1 = Player("Arthas", 100, 50)

    player1.damage()
    player1.healing()
    player1.damage()

    if (player1.health <= 0) {
        player1.getDeath()
    }

}

const val HEALING_FLASK = 40