package org.example.lesson_14

import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun areaCalculation(): Double

    abstract fun perimeterCalculation(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun areaCalculation(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeterCalculation(): Double {
         return CONST_FOR_FORMULAS * PI * radius
    }
}

class Rectangle(
    color: String,
    val a: Double,
    val b: Double,
) : Figure(color) {
    override fun perimeterCalculation(): Double {
        return CONST_FOR_FORMULAS * (a + b)
    }

    override fun areaCalculation(): Double {
        return a * b
    }
}


fun main() {
    val figureList = listOf(
        Circle("Black", 5.0),
        Circle("White", 6.0),
        Circle("Black", 5.5),
        Circle("White", 7.0),
        Rectangle("Black", 13.0, 1.5),
        Rectangle("Black",8.0, 5.0),
        Rectangle("White",4.0, 6.0),
        Rectangle("White", 3.0, 2.0),
    )

    val totalPerimeterBlack = figureList
        .filter { it.color == "Black" }
        .sumOf { it.perimeterCalculation() }

    val totalWhiteArea = figureList
        .filter { it.color == "White" }
        .sumOf { it.areaCalculation() }

    println(totalPerimeterBlack)
    println(totalWhiteArea)
}

const val PI = 3.14
const val CONST_FOR_FORMULAS = 2