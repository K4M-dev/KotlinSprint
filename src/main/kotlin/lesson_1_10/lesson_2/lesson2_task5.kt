package org.example.lesson_1_10.lesson_2

import kotlin.math.pow

const val NUMBER_OF_CHARGES = 1

fun main() {

    val startSum = 70000
    val interestRate = 16.7
    val years = 20

    val firstPart = (1 + ((interestRate / FULL_PERCENT) / NUMBER_OF_CHARGES))

    val result = (firstPart.pow(NUMBER_OF_CHARGES * years)) * startSum

    val formatedResult: String = String.format("%.3f", result)

    println(formatedResult)

}