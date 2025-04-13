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

    fun changeStatus(nickName: String, newStatus: String) {
        val member = members.find { it.nickName == nickName }
        if (member != null) {
            member.status = newStatus
        }
    }

    fun printChangeStatus(member: User) {
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
    room1.changeStatus("user1", "молчит")
    room1.printChangeStatus(user1)
}