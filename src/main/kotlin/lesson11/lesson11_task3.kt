package org.example.lesson11

class User(
    var id: Int,
    var nickName: String,
    var status: String, // "говорит", "микрофон выключен", "пользователь заглушен"
    var userAvatar: String,
)

class Room(
    var cover: String,
    var nameRoom: String,
    val members: MutableList<User> = mutableListOf(),
    val userAvatars: MutableList<String> = mutableListOf(),
) {
    fun addMember(member: User) {
        members.add(member)
        println("Пользователь ${member.nickName} добавлен в комнату $nameRoom")
    }

    fun changeStatus(member: User) {
        println("Пользователь с никнеймом: ${member.nickName} и статусом: ${member.status}")
        println("Какой статус присвоить пользователю ${member.nickName}?")
        member.status = readln()
        println("Статус пользователя ${member.nickName} изменён на ${member.status}")
    }
}

fun main() {
    val room1 = Room(
        cover = "avatarRoom",
        nameRoom = "Members",
    )

    val user1 = User(
        id = 1,
        nickName = "user1",
        status = "говорит",
        userAvatar = "picture"
    )
    room1.addMember(user1)
    room1.changeStatus(user1)
}