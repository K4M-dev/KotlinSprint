package org.example.lesson_16

class Player(
    private val name: String,
    private var health: Int,
    private var attackPower: Int,
) {

    fun receiveDamage(damageAmount: Int) {
        health -= damageAmount
        println("Игроку $name нанесено $damageAmount урона")

        if (health <= 0) {
            println(death())
        } else println("Осталось здоровья $health")
    }

    fun getHeal() {
        if (health > 0) {
            health += HEALING_FLASK
            println("Игрок $name выпил лечебную колбу и получил +$HEALING_FLASK hp")
            println("Здровья $health hp")
            health
        } else println("Игрок мёртв, лечение невозможно")
    }

    private fun death(): String {
        attackPower = 0
        health = 0
        return "Игрок $name погиб в бою"
    }
}

fun main() {

    val player1 = Player("Arthas", 100, 50)

    player1.receiveDamage(100)
    player1.getHeal()
    player1.receiveDamage(100)
}

const val HEALING_FLASK = 40