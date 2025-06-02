package org.example.lesson_17

class UserData(
    private var userLogin: String,
    userPassword: String
) {
    private val lengthPassword = userPassword.length

    var passwordActions: String
        get() = "*".repeat(lengthPassword)
        set(value) {
            println("Вы не можете изменить пароль")
        }

    var loginChange: String
        get() = "Текущий логин $userLogin"
        set(value) {
            userLogin = value
            println("Вы успешно сменили логин на $userLogin")
        }
}

fun main() {
    val user1 = UserData("admin", "pass1")

    println(user1.passwordActions)
    user1.passwordActions = "pass2"
    println()
    println(user1.loginChange)
    user1.loginChange = "admin2"

}