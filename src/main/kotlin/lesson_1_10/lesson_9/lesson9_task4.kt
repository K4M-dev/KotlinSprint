package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите пять ингредиентов через запятую с пробелом")

    val ingredients = readln().toString()

    val ingredientsList = ingredients.split(", ")

    if (ingredientsList.size == MINIMAL_SIZE_LIST) {
        val sortedList = ingredientsList.sorted()
        println(sortedList.joinToString(", "))
    } else (println("Введите ровно пять ингредиентов"))


}

const val MINIMAL_SIZE_LIST = 5

