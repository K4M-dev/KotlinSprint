package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите пять ингредиентов")

    val ingredientsSet = mutableSetOf<String>()

    do {
        val ingredient = readln()
        ingredientsSet.add(ingredient)
    } while (ingredientsSet.size < MIN_SIZE_LIST)

    val sortedUniqueList = ingredientsSet.sorted()
    val firstWord = sortedUniqueList.firstOrNull()
    val finalList = sortedUniqueList.drop(1)

    if (firstWord != null) {
        val finalFirstWord = firstWord.replaceFirstChar { it.uppercase() }
        println(finalFirstWord + ", " + finalList.joinToString(", "))
        return
    }


}

const val MIN_SIZE_LIST = 5

