package org.example.lesson_1_10.lesson_7

fun main() {
    println("Введите кол-во секунд которое нужно засечь")

    var seconds = readln().toInt()

    for (i in seconds downTo 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}