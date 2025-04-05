package org.example.lesson_1_10.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("Яйцо", "Перец", "Помидор", "Зелень", "Соль")

    val searchOfIngredient = readln().toString()

    for (i in arrayOfIngredients) {
        if (searchOfIngredient == i) {
            println("Ингредиент \"$i\" в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}