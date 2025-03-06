package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val winNumbers = List(3) { Random.nextInt(0, 42) }

    println("Введите первое число от 0 до 42")

    val firstNumber = readln().toInt()

    println("Введите второе число от 0 до 42")

    val secondNumber = readln().toInt()

    println("Введите третье число от 0 до 42")

    val thirdNumber = readln().toInt()

    val userNumbers = listOf(firstNumber, secondNumber, thirdNumber)

    val intersection = winNumbers.intersect(userNumbers.toSet())

    val intersectionSize = intersection.size

    when (intersectionSize) {
        3 -> println("Вы выиграли джекпот!")
        2 -> println("Вы выиграли крупный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача")
    }

    println("Выигрышные числа: $winNumbers")
}