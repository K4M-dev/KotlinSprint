package org.example.lesson_8

fun main() {

    println("Введите количество ингредиентов")

    val quantityOfIngredients = readln().toInt()

    val arrayOfIngredients: Array<String> = Array(quantityOfIngredients) { DEFAULT_VALUE }

    for (i in arrayOfIngredients) {
        println("Введите ингредиент ${arrayOfIngredients.indexOf(i) + UNIT_SERIAL_NUMBER}")
        val ingredient = readln().toString()
        arrayOfIngredients[arrayOfIngredients.indexOf(i)] = ingredient
    }

    println("Ингредиенты: ${arrayOfIngredients.joinToString(", ")}")
}

const val DEFAULT_VALUE = "default"
const val UNIT_SERIAL_NUMBER = 1