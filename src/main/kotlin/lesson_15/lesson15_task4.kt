package org.example.lesson_15

abstract class MusicShop(
    val name: String,
    val quantity: Int,
) {
    abstract fun printInfo(): String
}

interface ProductSearch {
    fun productSearch() {
    }
}

class Instruments(name: String, quantity: Int) : MusicShop(name, quantity) {
    override fun printInfo(): String {
        return "Инструмент $name, количество $quantity"
    }
}

class Components(name: String, quantity: Int) : MusicShop(name, quantity), ProductSearch {
    override fun printInfo(): String {
        return "Компонент $name, количество $quantity"
    }

    override fun productSearch() {
        println("Выполняется поиск")
    }
}

fun main() {
    val instrument = Instruments("Гитара", 2)
    val component = Components("Струны", 10)

    println(instrument.printInfo())
    println(component.printInfo())
    component.productSearch()

}