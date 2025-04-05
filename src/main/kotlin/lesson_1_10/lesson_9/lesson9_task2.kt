package org.example.lesson_1_10.lesson_9

fun main() {

    val baseIngredients = mutableListOf("Яйцо", "Перец", "Лук")

    println("В рецепте есть следующие ингредиенты: ${baseIngredients.joinToString(", ")}")

    println("Желаете ли добавить ещё?")

    val answer = readln().toString()

    if (POSITIVE_RESPONSE.equals(answer, ignoreCase = true)) {
        println("Напишите ингридиент, который хотите добавить")
        baseIngredients.add(readln().toString())
        println("Теперь в рецепте есть следующие ингредиенты: ${baseIngredients.joinToString(", ")}")
    } else (return)

}

const val POSITIVE_RESPONSE = "Да"