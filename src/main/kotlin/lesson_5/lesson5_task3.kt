package org.example.lesson_5

fun main() {
    println("Введите первое число от 0 до 42")

    val a = readln().toInt()

    println("Введите второе число от 0 до 42")

    val b = readln().toInt()

    val winNumberFirst = 17
    val winNumberSec = 19

    if ((a == winNumberFirst) && (b == winNumberSec)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((a == winNumberSec) && (b == winNumberFirst)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((a == winNumberFirst) || (b == winNumberFirst)) {
        println("Вы выиграли утешительный приз!")
    } else if ((a == winNumberSec) || (b == winNumberSec)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }
}