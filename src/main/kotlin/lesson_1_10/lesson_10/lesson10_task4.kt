package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun main() {
    var countWin = START_COUNT_VICTORIES

    do {
        val peopleNumber = peopleRound()
        val machineNumber = machineRound()

        if (peopleNumber > machineNumber) {
            println("Победило человечество")
            countWin += ONE_WIN
        } else if (peopleNumber < machineNumber) {
            println("Победила машина")
        } else (println("Победила дружба"))
        println("Желаете ли бросить кубики ещё раз?")
        val userAnswer = readln()
    } while ((POSITIVE_ANSWER.equals(userAnswer, ignoreCase = true)))

    println("Количество выиграных партий: $countWin")
}


fun throwDice(): Int = Random.nextInt(1, 6)

fun peopleRound(): Int {

    println("Ход человечества")
    val peopleNumber = throwDice()
    println("Выпало число: $peopleNumber")
    return peopleNumber
}

fun machineRound(): Int {
    println("Ход машин")
    val machineNumber = throwDice()
    println("Выпало число: $machineNumber")
    return machineNumber
}

const val POSITIVE_ANSWER = "Да"
const val START_COUNT_VICTORIES = 0
const val ONE_WIN = 1