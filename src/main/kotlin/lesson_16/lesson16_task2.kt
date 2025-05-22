package org.example.lesson_16

import kotlin.math.pow

class Circle(private val radius: Double) {

    fun getCircumference(): Double = 2 * PI * radius

    fun getArea(): Double = PI * radius.pow(2.0)

}

fun main() {

    val circle = Circle(4.0)

    println(circle.getCircumference())
    println(circle.getArea())
}

const val PI = 3.14