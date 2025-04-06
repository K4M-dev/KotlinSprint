package org.example.lesson11

class User(
    val id: Int,
    val login: String,
    val pass: String,
    val mail: String,
) {

}

fun main() {

    val user1 = User(
        id = 1,
        login = "user1log",
        pass = "user1pass",
        mail = "user1@mail.ru",
    )

    val user2 = User(
        id = 2,
        login = "user2log",
        pass = "user2pass",
        mail = "user2@mail.ru",
    )

    println(user1.id)
    println(user1.login)
    println(user1.pass)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.pass)
    println(user2.mail)
}

