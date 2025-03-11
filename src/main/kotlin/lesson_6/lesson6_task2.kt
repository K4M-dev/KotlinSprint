package org.example.lesson_6

fun main() {

    println("Введите кол-во секунд которое нужно засечь")

    var seconds = readln().toInt()
    val fullSeconds = seconds

    while (seconds > 0) {
        println("Секунд осталось ${seconds--}")
        Thread.sleep(1000)
    }

    println("Прошло $fullSeconds секунд")
}