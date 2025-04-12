package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun displayInfo() {
        println("Информация пользователя: $id, $login, $password, $mail, $bio")
    }

    fun addBio() {
        println("Введите информацию о себе")
        bio = readln()
    }

    fun changePass() {
        println("Введите пароль")
        val enterPassword = readln()
        if (enterPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль изменён")
        }
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "admin",
        password = "pass",
        mail = "adminmail@mail.ru",
    )
    user.addBio()
    user.changePass()
    user.displayInfo()
}