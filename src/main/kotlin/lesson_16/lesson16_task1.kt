package org.example.lesson_16

class NumberCube() {

    private val numberCube = (1..6).random()

    fun getNumberCube() {

        println(numberCube)
    }
}

fun main() {

    val number = NumberCube()

    number.getNumberCube()
}
