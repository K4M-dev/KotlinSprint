package org.example.lesson_1_10.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val pass = readln()

    val tokenAccess = authorizeUser(login, pass)
    showGoods(tokenAccess)
}

fun authorizeUser(login: String, pass: String): String? {
    return if ((login == LOGIN) && (pass == PASS)) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val tokenPool = ('A'..'Z') + (0..9) + ('a'..'z')
    val token = StringBuilder()
    for (i in TOKEN_LENGTH downTo 1) {
        token.append(tokenPool.random())
    }
    return token.toString()

}

fun showGoods(tokenAccess: String?) {
    val listOfGoods = mutableListOf("Джинсы", "Кроссовки", "Носки", "Ремень")

    if (tokenAccess == null) {
        println("Неудачная авторизация!")
    } else println("В вашей корзине: ${listOfGoods.joinToString(", ")}")
}

const val LOGIN = "admin_log"
const val PASS = "admin_pass"
const val TOKEN_LENGTH = 32
