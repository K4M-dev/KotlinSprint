package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH;

    fun getFishName(): String {

        return when (this) {
            GUPPY -> "Гуппи"
            ANGELFISH -> "Скалярия"
            GOLDFISH -> "Золотая рыбка"
            SIAMESE_FIGHTING_FISH -> "Петушок"
        }
    }
}

fun main() {

    val listOfFish = Fish.entries.toTypedArray()

    for (fish in listOfFish) {
        println("ID: ${fish.ordinal + UNIT_FOR_ID}, название: ${fish.getFishName()}")
    }
}

const val UNIT_FOR_ID = 1
