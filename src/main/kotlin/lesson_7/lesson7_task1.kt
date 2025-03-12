package org.example.lesson_7

fun main() {

    val charPool = ('a'..'z') + (0..9)
    val password = StringBuilder()

    for (i in 6 downTo 1) {
        val randomChar = charPool.random()
        password.append(randomChar)
    }

    println(password)
}