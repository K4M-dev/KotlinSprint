package org.example.lesson_15

abstract class Forum(
    val id: Int,
    val userName: String,
    val message: String,
) {
    abstract fun sendMessage(): String
}

class User(id: Int, userName: String, message: String) : Forum(id, userName, message) {
    override fun sendMessage(): String {
        return "($id)$userName : $message"
    }
}

class Admin(id: Int, adminName: String, message: String) : Forum(id, adminName, message) {
    override fun sendMessage(): String {
        return "($id)$userName : $message (admin)"
    }

    fun deleteMessage(messageId: Int): String {
        return "Администратор $userName удалил сообщение с ID:$messageId"
    }

    fun deleteUser(userNameToRemove: String): String {
        return "Администратор $userName удалил пользователя $userNameToRemove с форума"
    }
}

fun main() {
    val user = User(1, "Alex", "Всем привет")
    val admin = Admin(100, "SuperUser", "Привет")

    println(user.sendMessage())
    println(admin.sendMessage())
    println(admin.deleteUser("Alex"))
    println(admin.deleteMessage( 1))


}