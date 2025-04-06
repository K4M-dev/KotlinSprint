package org.example.lesson11

class User(
    var id: Int,
    var nickName: String,
    var status: String, // "говорит", "микрофон выключен", "пользователь заглушен"
    var userAvatar: String,
) {

}

class Room(
    var cover: String,
    var nameRoom: String,
    val members: MutableList<User> = mutableListOf(),
    val userAvatars: MutableList<String> = mutableListOf(),
) {
    fun addMember() {
        println("Введите id пользователя")
        val id = readln().toInt()
        println("Введите никнейм пользователя")
        val nickName = readln()
        println("Введите статус пользователя")
        val status = readln()
        println("Добавьте аватар для пользователя")
        val userAvatar = readln()
        val member = User(id, nickName, status, userAvatar)
        members.add(member)
        userAvatars.add(userAvatar)
        println("Пользователь ${member.nickName} добавлен в комнату $nameRoom")
    }

    fun changeStatus() {
        println("Введите имя пользователя, кому хотите сменить статус")
        val nickName = readln()
        val user = members.find { it.nickName == nickName }
        if (user != null) {
            println("Какой статус присвоить пользователю?")
            user.status = readln()
            println("Статус пользователя $nickName изменён на ${user.status}")
        } else println("Такого пользователя нет")

    }

    fun holdLongTime(member: User) {
        println("Удерживайте, чтобы подсветить никнейм")
        val longPress: Boolean = readln().toBoolean()
        if (longPress) {
            println(member.nickName)
        }
    }

    fun changeCover() {
        println("Добавьте новое изображение для комнаты")
        cover = readln()
        println("Изображение комнаты изменено на $cover")
    }

    fun changeNameRoom() {
        println("Введите новое название комнаты")
        nameRoom = readln()
        println("Название комнаты изменено на $nameRoom")
    }

    fun showAllMembers() {
        println("Все участники: $userAvatars")
    }

}

fun main() {
    val room1 = Room(
        cover = "avatarRoom",
        nameRoom = "Members",
    )

    room1.addMember()
    room1.changeStatus()
    room1.changeCover()
    room1.changeNameRoom()
    room1.showAllMembers()
    room1.holdLongTime(room1.members[0])


}