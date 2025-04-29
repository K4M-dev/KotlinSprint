package org.example.lesson_14

open class LinerShip2(
    val name: String,
    val speed: Int = 60,
    val loadCapacity: Int = 600,
    val passengers: Int = 100,
) {
    open fun printShipInfo() {
        println("Имя корабля: $name \nСкорость: $speed \nГрузоподъёмность: $loadCapacity\nВместимость пассажиров: $passengers")
    }

    open fun startLoading() {
        println("Выдвижение горизонтального трапа со шкафута, начало погрузки")
    }

    open fun endLoading() {
        println("Возвращение трапа на шкафут, завершение погрузки")
        println()
    }
}

class CargoShip2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengers: Int,
) : LinerShip2(name, speed, loadCapacity, passengers) {

    override fun startLoading() {
        println("Активация погрузочного крана, начало погрузки")
    }

    override fun endLoading() {
        println("Деактивация погрузочного крана, завершение погрузки")
        println()
    }
}

class IceBreaker2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengers: Int,
    val iceAxe: Boolean = true
) : LinerShip2(name, speed, loadCapacity, passengers) {

    override fun printShipInfo() {
        println("Имя корабля: $name \nСкорость: $speed \nГрузоподъёмность: $loadCapacity\nВместимость пассажиров: $passengers" +
                "\nВозможность колоть лёд: $iceAxe")
    }

    override fun startLoading() {
        println("Открытие ворот со стороны кормы, начало погрузки")
    }

    override fun endLoading() {
        println("Закрытие ворот, завершение погрузки")
        println()
    }
}

fun main() {

    val cargo2 = CargoShip2("cargo2", 30, 950,50)
    cargo2.printShipInfo()
    cargo2.startLoading()
    cargo2.endLoading()

    val liner2 = LinerShip2("liner2")
    liner2.printShipInfo()
    liner2.startLoading()
    liner2.endLoading()

    val ice2 = IceBreaker2("ice1", 30, 500, 40, true)
    ice2.printShipInfo()
    ice2.startLoading()
    ice2.endLoading()
}