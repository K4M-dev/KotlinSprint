package org.example.lesson_20

class Player(
    val name: String,
    private val hasKey: Boolean,
) {
    fun presenceKey(): Boolean {
        return hasKey
    }
}

fun main() {

    val player2 = Player("Guardian", true)
    val player3 = Player("Arthas", false)

    val door: (Player) -> String = { player ->
        if (player.presenceKey()) {
            "Игрок ${player.name} открыл дверь"
        } else {
            "У игрока ${player.name} нет ключа"
        }
    }

    println(door(player2))
    println(door(player3))
}