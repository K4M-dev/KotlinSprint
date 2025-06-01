package org.example.lesson_17

class Quiz(
    private var question: String,
    private var answer: String,
) {
    val quest: String
        get() = question

    var quizAnswer: String
        get() = answer
        set(value) {
            answer = value
        }
}

fun main() {

    val quiz1 = Quiz("Как вас зовут?", "Андрей")

    println("Вопрос: ${quiz1.quest}")
    println("Ответ: ${quiz1.quizAnswer}")

    quiz1.quizAnswer = "Дмитрий"
    println("Обновленный ответ: ${quiz1.quizAnswer}")
}