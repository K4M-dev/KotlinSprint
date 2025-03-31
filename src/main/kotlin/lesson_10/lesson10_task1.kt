package org.example.lesson_10

import kotlin.random.Random

fun main() {

    println("Ход человечества")
    val peopleNumber = throwDice()
    println("Выпало число: $peopleNumber")


    println("Ход машин")
    val roboNumber = throwDice()
    println("Выпало число: $roboNumber")

    if (peopleNumber > roboNumber) {
        println("Победило человечество")
    } else if (peopleNumber < roboNumber) {
        println("Победила машина")
    } else (println("Победила дружба"))

}

fun throwDice(): Int = Random.nextInt(1, 6)


