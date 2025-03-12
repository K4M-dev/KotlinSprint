package org.example.lesson_6

fun main() {

    println("Введите кол-во секунд которое нужно засечь")

    val seconds = readln().toInt()

    val millis = (seconds * SECONDS_TO_MILLIS).toLong()

    Thread.sleep(millis)

    println("Прошло $seconds секунд")
}
const val SECONDS_TO_MILLIS = 1000