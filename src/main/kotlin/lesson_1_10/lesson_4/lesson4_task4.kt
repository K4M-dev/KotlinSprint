package org.example.lesson_1_10.lesson_4

fun main() {

    println("Введите день тренировки")

    val day = readln().toInt()

    val dayValidation = (day % 2 == 0)

    println(
        """
        Упражнения для рук: ${!dayValidation}
        Упражнения для ног: $dayValidation
        Упражнения для спины: $dayValidation
        Упражнения для пресса: ${!dayValidation}
    """.trimIndent())

}