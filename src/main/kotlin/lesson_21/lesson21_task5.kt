package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {

    val maxExp = this.maxByOrNull { it.value }
    return maxExp?.key ?: "Карта навыков пуста"
}

fun main() {

    val skills = mapOf(
        "Сила" to 60,
        "Ловкость" to 70,
        "Интеллект" to 70,
        "Выносливость" to 40
    )

    println("Навык с максимальным опытом: ${skills.maxCategory()}")
}