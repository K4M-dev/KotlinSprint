package org.example.lesson11

class Forum(
    private var nextUserId: Int = 1,
    val members: MutableList<ForumMember> = mutableListOf(),
    val messages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(userName: String): ForumMember {
        val user = ForumMember(nextUserId++, userName)
        members.add(user)
        return user
    }

    fun createNewMessage(userId: Int, message: String) {
        val user = members.find { it.userId == userId }
        if (user != null) {
            val forumMessage = ForumMessage(userId, message)
            messages.add(forumMessage)
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = members.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.userName} : ${message.message}")
            }
        }
    }

}

class ForumMember(
    val userId: Int,
    val userName: String,
) {
    override fun toString(): String {
        return "ForumMember(userId='$userId', userName='$userName')"
    }
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    override fun toString(): String {
        return "ForumMember(authorId='$authorId', message='$message')"
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Alex")
    val user2 = forum.createNewUser("Masha")

    forum.createNewMessage(user1.userId, "Hello, Alex")
    forum.createNewMessage(user2.userId, "Hi, Masha")
    forum.createNewMessage(user1.userId, "How are you?")
    forum.createNewMessage(user2.userId, "Fine, thank you")

    forum.printThread()

}



