package org.example.lesson_17

class ShipLes17(
    private val name: String,
    val avgSpeed: Int,
    val portRegistry: String,
) {
    val _name: String
        get() = name

    var errorChange: String
        get() = _name
        set(value) {
            println("Имя корабля менять нельзя. Текущее имя: $_name")
        }
}

fun main() {

    val ship1 = ShipLes17("Корабль1", 55, "Порт1")

    println("Имя корабля: ${ship1._name}")

    ship1.errorChange = "Корабль2"
}