package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {

    val listOfId = listOf(1, 2, 3, 4)

    for (i in listOfId) {
        when(i) {
            1 -> setFishName(Fish.GUPPY)
            2 -> setFishName(Fish.ANGELFISH)
            3 -> setFishName(Fish.GOLDFISH)
            4 -> setFishName(Fish.SIAMESE_FIGHTING_FISH)
        }
    }

}

fun setFishName(fish: Fish) {

    when(fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Скалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}