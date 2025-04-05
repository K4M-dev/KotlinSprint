package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun main() {

    println("Ход человечества")
    val peopleNumber = rollDice()
    println("Выпало число: $peopleNumber")


    println("Ход машин")
    val roboNumber = rollDice()
    println("Выпало число: $roboNumber")

    if (peopleNumber > roboNumber) {
        println("Победило человечество")
    } else if (peopleNumber < roboNumber) {
        println("Победила машина")
    } else (println("Победила дружба"))

}

fun rollDice(): Int = Random.nextInt(1, 6)


