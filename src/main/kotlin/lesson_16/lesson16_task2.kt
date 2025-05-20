package org.example.lesson_16

import kotlin.math.pow

class Circle(private var radius: Double) {

    private val pi = 3.14

    fun lengthCalculation(): Double {
        val l = 2 * pi * radius
        return l
    }

    fun areaCalculation(): Double {

        val area = pi * radius.pow(2.0)
        return area
    }

}

fun main() {

    val circle = Circle(4.0)

    println(circle.lengthCalculation())
    println(circle.areaCalculation())
}