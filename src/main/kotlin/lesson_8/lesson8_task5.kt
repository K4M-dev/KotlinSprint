package org.example.lesson_8

fun main() {

    println("Введите количество ингредиентов, после этого вводите ингридиенты по одному")

    val arrayOfIngredients = Array(readln().toInt()) { readln() }

    println("Ингредиенты: ${arrayOfIngredients.joinToString(", ")}")
}