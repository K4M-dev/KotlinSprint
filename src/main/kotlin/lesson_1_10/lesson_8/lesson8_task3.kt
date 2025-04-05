package org.example.lesson_1_10.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("Яйцо", "Перец", "Помидор", "Зелень", "Соль")

    val searchOfIngredient = readln().toString()

    if (searchOfIngredient in arrayOfIngredients) {
        println("Ингредиент \"$searchOfIngredient\" в рецепте есть")
        return
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}