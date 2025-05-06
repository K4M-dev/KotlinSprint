package org.example.lesson_15

interface Movable {

    fun movement()
}

class Crucian() : Movable {

    override fun movement() {
        println("Карась плывёт")
    }
}

class Seagull() : Movable {

    override fun movement() {
        println("Чайка летит")
    }
}

class Duck() : Movable {

    override fun movement() {
        println("Утка ходит, плывёт, взлетает")
    }
}

fun main() {

    val crucian = Crucian()
    crucian.movement()

    val seagull = Seagull()
    seagull.movement()

    val duck = Duck()
    duck.movement()

}
