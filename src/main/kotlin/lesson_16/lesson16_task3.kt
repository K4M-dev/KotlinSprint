package org.example.lesson_16

class UserManager(private val login: String, private val password: String) {

    fun userValidation(readLogin: String, readPassword: String): Boolean {
        return password == readPassword && login == readLogin
    }
}

fun main() {

    val user = UserManager("login", "password")

    val readLogin = "login"
    val readPassword = "password"

    if (user.userValidation(readLogin, readPassword)) {
        println("Авторизация успешна")
    } else println("Пароль или логин неверны")
}