package org.example.lesson_1_10.lesson_10

fun main() {
    println("Введите длину пароля")
    val passLength = readln().toInt()

    generatePass(passLength)
}

fun generatePass(passLength: Int) {

    val charPool = ('!'..'/') + (0..9) + (' ')

    val password = StringBuilder()

    for (i in passLength downTo  1) {
        password.append(charPool.random())
    }
    println(password)
}