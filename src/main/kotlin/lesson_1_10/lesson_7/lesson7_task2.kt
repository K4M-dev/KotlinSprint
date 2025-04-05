package org.example.lesson_1_10.lesson_7

fun main() {

    val charPool = (1000..9999)

    do {
        val randomMess = charPool.random().toString()
        println("Ваш код авторизации: $randomMess")
        val userAnswer = readln()
    } while (userAnswer != randomMess)

    println("Код верный, добро пожаловать!")

}