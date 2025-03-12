package org.example.lesson_6

fun main() {

    println("Введите кол-во секунд которое нужно засечь")

    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}