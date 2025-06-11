package org.example.lesson_20

var phrase: String = ""

fun say() {
    if (phrase.isEmpty()) {
        val listOfPhrases = listOf(
            "Привет!",
            "Как дела?",
            "Время поработать!",
            "Пора отдохнуть!",
            "Не спишь?"
        )

        phrase = listOfPhrases.random()
    }

    val modPhrase = modifier(phrase)
    println(modPhrase)
}

var modifier: (String) -> String = { it }

fun setModifier5(newModifier: (String) -> String) {
    modifier = newModifier
}

fun main() {

    say()

    setModifier5 { text -> text.split(" ").reversed().joinToString(" ") }

    say()
}