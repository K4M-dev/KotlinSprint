package org.example.lesson_4

fun main() {

    println("Введите день тренировки")

    val day = readln().toInt()

    val dayValidation = (day / 2 == 1)

    val handGroup = !(dayValidation)
    val footGroup = dayValidation
    val backGroup = dayValidation
    val pressGroup = !(dayValidation)

    println("""
        Упражнения для рук: $handGroup
        Упражнения для ног: $footGroup
        Упражнения для спины: $backGroup
        Упражнения для пресса: $pressGroup
    """.trimIndent())

}