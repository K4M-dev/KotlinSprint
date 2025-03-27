package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов")

    val ingredientsList = mutableListOf<String>()

    do {
        val ingredient = readln()
        ingredientsList.add(ingredient)
    } while (ingredientsList.size < MIN_SIZE_LIST)

    val uniqueList = ingredientsList.distinct()
    val sortedUniqueList = uniqueList.sorted()
    val firstWord = sortedUniqueList.firstOrNull()
    val finalList = sortedUniqueList.drop(1)

    if (firstWord != null) {
        val finalFirstWord = firstWord.replaceFirstChar { it.uppercase() }
        println(finalFirstWord + ", " + finalList.joinToString(", "))
        return
    }


}

const val MIN_SIZE_LIST = 5

