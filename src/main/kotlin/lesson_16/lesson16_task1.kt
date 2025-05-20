package org.example.lesson_16

import kotlin.random.Random

private class NumberCube() {

    private var numberCube = Random.nextInt(1, 6)

    fun getNumberCube() = numberCube
}

fun main() {

    val number = NumberCube()

    println(number.getNumberCube())
}
