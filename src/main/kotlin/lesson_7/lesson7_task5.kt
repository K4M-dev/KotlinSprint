package org.example.lesson_7

fun main() {

    val charPool = ('a'..'z') + (0..9) + ('A'..'Z')
    val password = StringBuilder()

    println("Введите длину пароля")

    do {
        val lengthPass = readln().toInt()
        if (lengthPass >= MIN_LENGTH_PASS) {
            for (i in lengthPass downTo 1) {
                val randomChar = charPool.random()
                password.append(randomChar)
            }
        } else (println("Неверно, минимальная длина пароля 6 символов!"))
    } while (lengthPass < MIN_LENGTH_PASS)

    println(password)
}

const val MIN_LENGTH_PASS = 6