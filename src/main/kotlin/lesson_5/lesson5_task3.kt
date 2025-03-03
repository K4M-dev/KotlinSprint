package org.example.lesson_5

fun main() {
    println("Введите первое число от 0 до 42")

    val firstNumber = readln().toInt()

    println("Введите второе число от 0 до 42")

    val secondNumber = readln().toInt()

    val winNumberFirst = 17
    val winNumberSec = 19

    if (((firstNumber == winNumberFirst) && (secondNumber == winNumberSec))
        || ((firstNumber == winNumberSec) && (secondNumber == winNumberFirst))) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (((firstNumber == winNumberFirst) || (secondNumber == winNumberFirst))
        || ((firstNumber == winNumberSec) || (secondNumber == winNumberSec))) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }
}