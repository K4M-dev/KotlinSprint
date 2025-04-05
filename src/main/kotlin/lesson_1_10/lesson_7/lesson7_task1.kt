package org.example.lesson_1_10.lesson_7

fun main() {

    val charPool1 = ('a'..'z')
    val charPool2 = (0..9)
    val password = StringBuilder()

    for (i in 6 downTo 1) {
        if (i % 2 == 0) {
            val randomChar1 = charPool1.random()
            password.append(randomChar1)
        } else {
            val randomChar2 = charPool2.random()
            password.append(randomChar2)
        }
    }

    println(password)
}