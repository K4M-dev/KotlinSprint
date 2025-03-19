package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("Яйцо", "Перец", "Помидор", "Зелень", "Соль")

    println("Ингредиенты: ${arrayOfIngredients.joinToString(", ")}")

    println("Введите название ингредиента, который хотите заменить")

    val changeIngredient = readln().toString()

    for (i in arrayOfIngredients) {
        if (changeIngredient in arrayOfIngredients) {
            println("Введите ингредиент, которым хотели бы заменить предыдущий")
            val newChange = readln().toString()
            arrayOfIngredients[arrayOfIngredients.indexOf(i)] = newChange
            println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString(", ")}")
            return
        } else {
            println("Такого ингредиента в списке нет")
            return
        }

    }

}