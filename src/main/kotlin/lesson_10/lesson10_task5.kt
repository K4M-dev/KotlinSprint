package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val pass = readln()

    val tokenAccess = authorization(login, pass)
    goods(tokenAccess)
}

fun authorization(login: String, pass: String): String? {
    return if ((login == LOGIN) && (pass == PASS)) {
        token()
    } else {
        null
    }
}

fun token(): String {
    val tokenPool = ('A'..'Z') + (0..9) + ('a'..'z')
    val token = StringBuilder()
    for (i in TOKEN_LENGTH downTo 1) {
        token.append(tokenPool.random())
    }
    return token.toString()

}

fun goods(tokenAccess: String?) {
    val listOfGoods = mutableListOf("Джинсы", "Кроссовки", "Носки", "Ремень")

    if (tokenAccess == null) {
        println("Неудачная авторизация!")
    } else println("В вашей корзине: ${listOfGoods.joinToString(", ")}")
}

const val LOGIN = "admin_log"
const val PASS = "admin_pass"
const val TOKEN_LENGTH = 32
