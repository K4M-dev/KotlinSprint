package org.example.lesson_21

fun String.vowelCount(): Int {

    val vowels = setOf(
        'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
        'a', 'e', 'i', 'o', 'u', 'y'
    )

    return this.count { it.lowercaseChar() in vowels }
}

fun main() {

    val word = "hello"

    println(word.vowelCount())

}