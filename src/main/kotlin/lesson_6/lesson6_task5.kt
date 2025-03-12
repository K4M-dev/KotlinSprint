package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var attempts = 3

    do {
        val firstNumber = Random.nextInt(1, 10)
        val secondNumber = Random.nextInt(1, 10)
        println("Сложите $firstNumber и $secondNumber")
        val userNumber = readln().toInt()
        if (userNumber == secondNumber + firstNumber) {
            println("Добро пожаловать!")
            return
        } else (println("Неверно! Осталось попыток: ${--attempts}"))
    } while (attempts > ZERO_ATTEMPT)

    println("Доступ запрещен")
}

const val ZERO_ATTEMPT = 0


