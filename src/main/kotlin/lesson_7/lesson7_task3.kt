package org.example.lesson_7

fun main() {

    println("Введите число")

    val userNumber = readln().toInt()

    val rangeToUser = 0..userNumber step 2

    for (i in rangeToUser) {
        println(i)
    }
}