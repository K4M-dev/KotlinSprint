package org.example.lesson_6

fun main() {

    println("Создайте логин")

    val loginNew = readln().toString()

    println("Создайте пароль")

    val passNew = readln().toString()

    do {
        println("Введите логин и пароль")
        val login = readln().toString()
        val pass = readln().toString()
    } while ((login != loginNew) || (pass != passNew))
}