package org.example.lesson_10

fun main() {

    println("Введите логин, длиной не меньше 4-х символов")

    val login = readln()

    println("Введите пароль, длиной не меньше 4-х символов")

    val pass = readln()

    checkLength(login, pass)

}

fun checkLength(login: String?, pass: String?) {
    val passLength = pass?.length
    val loginLength = login?.length

    if ((passLength!! < MIN_LENGTH) || (loginLength!! < MIN_LENGTH)) {
        print("Логин или пароль недостаточно длинные")
    } else (println("Добро пожаловать!"))

}

const val MIN_LENGTH = 4