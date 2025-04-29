package org.example.lesson_14

open class LinerShip(
    val name: String,
    val speed: Int = 60,
    val loadCapacity: Int = 600,
    val passengers: Int = 100,
) {
    open fun printShipInfo() {
        println("Имя корабля: $name \nСкорость: $speed \nГрузоподъёмность: $loadCapacity\nВместимость пассажиров: $passengers")
        println()
    }
}

class CargoShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengers: Int,
) : LinerShip(name, speed, loadCapacity, passengers)

class IceBreaker(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengers: Int,
    val iceAxe: Boolean = true
) : LinerShip(name, speed, loadCapacity, passengers) {

    override fun printShipInfo() {
        println("Имя корабля: $name \nСкорость: $speed \nГрузоподъёмность: $loadCapacity\nВместимость пассажиров: $passengers" +
                "\nВозможность колоть лёд: $iceAxe")
        println()
    }
}

fun main() {

    val cargo1 = CargoShip("cargo1", 30, 950,50)
    cargo1.printShipInfo()

    val liner1 = LinerShip("liner1")
    liner1.printShipInfo()

    val ice1 = IceBreaker("ice1", 30, 500, 40, true)
    ice1.printShipInfo()
}