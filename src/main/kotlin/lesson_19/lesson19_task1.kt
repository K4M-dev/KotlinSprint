package org.example.lesson_19

enum class Fish(private val displayName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    fun getFishName(): String {

        return displayName
    }
}

fun main() {

    val listOfFish = Fish.entries.toTypedArray()

    for (fish in listOfFish) {
        println("ID: ${fish.ordinal + UNIT_FOR_ID}, название: ${fish.getFishName()}")
    }
}

const val UNIT_FOR_ID = 1
