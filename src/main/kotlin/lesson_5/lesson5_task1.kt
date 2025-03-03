package org.example.lesson_5

fun main() {
    println("Сложите два числа: $FIRST_TERM и $SEC_TERM")

    val userNumber = readln().toInt()

    if (userNumber == FIRST_TERM + SEC_TERM) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён")
    }
}
const val FIRST_TERM = 3
const val SEC_TERM = 7