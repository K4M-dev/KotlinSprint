package org.example.lesson_1_10.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("Яйцо", "Перец", "Лук", "Зелень", "Петрушка")

    println("В рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}")

    listOfIngredients.forEach {
        println(it)
    }

}