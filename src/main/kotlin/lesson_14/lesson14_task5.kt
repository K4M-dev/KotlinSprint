package org.example.lesson_14

class Chat(
    val messageList: MutableList<Message> = mutableListOf(),
    val childMessages: MutableList<ChildMessage> = mutableListOf()
) {

    fun addMessage(authorId: Int, authorName: String, messageText: String) {
        val message = Message.createMessage(authorId, authorName, messageText)
        messageList.add(message)
    }

    fun addMessageThread(parentMessageId: Int, authorId: Int, authorName: String, messageText: String) {
        if (messageList.any { it.messageId == parentMessageId }) {
            val childMessage = ChildMessage.createChildMessage(authorId, authorName, messageText, parentMessageId)
            childMessages.add(childMessage)
        } else {
            println("Родительское сообщение с id $parentMessageId не найдено.")
        }
    }

    fun printChat() {

        println("Чат:")
        val groupedChildMessages = childMessages.groupBy { it.parentMessageId }

        messageList.forEach { msg ->
            println("${msg.authorName}: ${msg.messageText} (id: ${msg.messageId})")

            groupedChildMessages[msg.messageId]?.forEach { child ->
                println("\t${child.authorName}: ${child.messageText} (дочернее сообщение id: ${child.messageId})")
            }
        }
    }

}

open class Message(
    val authorId: Int,
    val authorName: String,
    val messageText: String,
    val messageId: Int,
    val parentMessageId: Int? = null,
) {

    companion object {
        var idCounter = START_COUNT
        fun createMessage(authorId: Int, authorName: String, messageText: String): Message {
            idCounter++
            return Message(idCounter, authorName, messageText, authorId)
        }
    }
}


class ChildMessage(
    authorId: Int,
    authorName: String,
    messageText: String,
    parentMessageId: Int,
    messageId: Int,
) : Message(authorId, authorName, messageText, messageId, parentMessageId) {

    companion object {
        var idChildCounter = START_COUNT
        fun createChildMessage(
            authorId: Int,
            authorName: String,
            messageText: String,
            parentMessageId: Int
        ): ChildMessage {
            idChildCounter++
            return ChildMessage(authorId, authorName, messageText, parentMessageId, idChildCounter)
        }
    }
}

fun main() {

    val chat = Chat()

    chat.addMessage(1, "Alice", "Привет всем!")
    chat.addMessage(2, "Bob", "Привет, Alice!")

    chat.addMessageThread(2, 1, "Alice", "Как дела?")
    chat.addMessageThread(2, 2, "Bob", "Все хорошо, спасибо!")

    chat.printChat()

}

const val START_COUNT = 0