package org.example.lesson_5

fun main() {
    println("Сложите два числа: 3 и 7")

    val userNumber = readln().toInt()

    if (userNumber == 3 + 7) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён")
    }
}