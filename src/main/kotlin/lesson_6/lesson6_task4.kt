package org.example.lesson_6

fun main() {

    val winNumber = readln().toInt()

    var attempts = 5

    println("Введите число")

    do {
        val userNumber = readln().toInt()
        if (userNumber == winNumber) {
            println("Верно! Это была великолепная игра!")
            return
        } else (println("Неверно! Осталось попыток: ${--attempts}"))
    } while (attempts > ZERO_ATTEMPTS)

    println("Было загадано число $winNumber")


}

const val ZERO_ATTEMPTS = 0