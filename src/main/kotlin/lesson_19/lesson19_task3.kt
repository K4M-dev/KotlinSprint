package org.example.lesson_19

class SpaceShip(
    private val name: String,
    private val typeShip: String,
    private val speed: Int,
    private val quantityOfWeapons: Int,
) {
    fun fly() {
        println("Корабль $name взлетел")
        println("Корабль $name приземлился")
        // TODO требуется дополнительная логика
    }

    fun shooting(): Boolean {
        TODO()
    }
}

fun main() {
    val ship1 = SpaceShip("Ship1", "Stormtrooper", 150, 14)

    ship1.fly()
    ship1.shooting()
}