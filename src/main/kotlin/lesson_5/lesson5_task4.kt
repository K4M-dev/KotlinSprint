package org.example.lesson_5

fun main() {
    println("Введите имя пользователя")

    val userName = readln()

    if (userName != "Zaphod") {
        println("Пользователя нет в системе, зарегистрируйтесь!")
        return
    } else {
        println("Введите пароль")
    }

    val password = readln()

    when (password) {
        "PanGalactic" -> println("Добро пожаловать, $userName!")
        else -> println("Неверный пароль!")
    }
}