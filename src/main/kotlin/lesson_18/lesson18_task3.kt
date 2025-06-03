package org.example.lesson_18

open class AnimalActions {

    open fun getSleepResult() = ""

    open fun getEatResult() = ""
}

class Fox(
    private val name: String = "Fox",
    private val actionSleep: String = "Спит",
    private val actionEat: String = "Ест",
) : AnimalActions() {

    override fun getSleepResult(): String {
        return "$name -> $actionSleep"
    }

    override fun getEatResult(): String {
        return "$name -> $actionEat"
    }
}

class Dog(
    private val name: String = "Dog",
    private val actionSleep: String = "Спит",
    private val actionEat: String = "Ест",
) : AnimalActions() {

    override fun getSleepResult(): String {
        return "$name -> $actionSleep"
    }

    override fun getEatResult(): String {
        return "$name -> $actionEat"
    }
}

class Cat(
    private val name: String = "Cat",
    private val actionSleep: String = "Спит",
    private val actionEat: String = "Ест",
) : AnimalActions() {

    override fun getSleepResult(): String {
        return "$name -> $actionSleep"
    }

    override fun getEatResult(): String {
        return "$name -> $actionEat"
    }
}

fun main() {

    val fox1: AnimalActions = Fox()

    val dog1: AnimalActions = Dog()

    val cat1: AnimalActions = Cat()

    val listOfAnimals = listOf<AnimalActions>(fox1, dog1, cat1)
    showEatResult(listOfAnimals)
}

fun showEatResult(eat: List<AnimalActions>) {
    eat.forEach {
        println(it.getEatResult())
    }
}