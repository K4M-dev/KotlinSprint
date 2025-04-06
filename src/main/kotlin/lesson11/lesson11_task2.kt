package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val mail: String,
    var bio: String,
) {
    fun displayInfo() {
        println("Информация пользователя: $id, $login, $pass, $mail, $bio")
    }

    fun addBio() {
        println("Введите информацию о себе")
        bio = readln()
    }

    fun changePass() {
        println("Введите пароль")
        val enterPass = readln()
        if (enterPass == pass) {
            println("Введите новый пароль")
            pass = readln()
            println("Пароль изменён")
        }
    }


}

fun main() {
    val user = User2(
        id = 1,
        login = "admin",
        pass = "pass",
        mail = "adminmail@mail.ru",
        bio = "clear",
    )

    user.addBio()
    user.changePass()
    user.displayInfo()

}