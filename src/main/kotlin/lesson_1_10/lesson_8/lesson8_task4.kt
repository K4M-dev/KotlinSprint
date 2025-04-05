package org.example.lesson_1_10.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("Яйцо", "Перец", "Помидор", "Зелень", "Соль")

    println("Ингредиенты: ${arrayOfIngredients.joinToString(", ")}")

    println("Введите название ингредиента, который хотите заменить")

    val changeIngredient = readln().toString()

    val index = arrayOfIngredients.indexOf(changeIngredient)

    if (index != UNIT_COMPARISON) {
        println("Введите ингредиент, которым хотели бы заменить предыдущий")
        val newChange = readln().toString()
        arrayOfIngredients[index] = newChange
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString(", ")}")
        return
    } else {
        println("Такого ингредиента в списке нет")
        return
    }


}

const val UNIT_COMPARISON = -1