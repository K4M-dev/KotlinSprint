package org.example.lesson_20

fun main() {

    val listOfElements = listOf(
        "Кнопка домой",
        "Кнопка избранное",
        "Кнопка корзина",
        "Кнопка поиск"
    )

    val listOfLambdas: List<() -> String> = listOfElements.map { element -> { "Нажат элемент $element" } }

    val filteredLambdas: List<() -> String> = listOfLambdas.withIndex()
        .filter { (index, _) -> index % 2 == 0 }
        .map { (_, lambda) -> lambda }

    for (lambda in filteredLambdas) {
        println(lambda())
    }
}
