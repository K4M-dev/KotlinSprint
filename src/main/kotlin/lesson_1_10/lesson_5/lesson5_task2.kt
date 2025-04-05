package org.example.lesson_1_10.lesson_5

fun main() {
    println("Введите год рождения")

    val userYearBirth = readln().toInt()
    val currentYear = 2025

    val userAge = currentYear - userYearBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Show special content")
    } else {
        println("Back to main screen")
    }

}

const val AGE_OF_MAJORITY = 18