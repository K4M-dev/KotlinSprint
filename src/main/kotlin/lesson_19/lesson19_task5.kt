package org.example.lesson_19

enum class GenderOfPerson {
    MALE,
    FEMALE,
}

class Human(val name: String, val gender: GenderOfPerson)

class CatalogOfHumans() {

    private val listOfHumans = mutableListOf<Human>()

    fun displayInstruction() {
        println("Введите информацию о 5 людях. Формат ввода:")
        println("Имя: <имя>, Пол: (MALE / FEMALE)")
        println("Например: John MALE")
    }

    fun addHumansInList() {
        while (listOfHumans.size < 5) {
            print("Введите данные человека (Имя): ")
            val name = readln()
            print("Введите пол (MALE / FEMALE): ")
            val inputGender: String = readln()
            val gender = when (inputGender) {
                "MALE" -> GenderOfPerson.MALE
                "FEMALE" -> GenderOfPerson.FEMALE
                else -> {
                    println("Неверный ввод для пола! Пожалуйста, проверьте данные и заполните анкету заного.")
                    continue
                }
            }
            listOfHumans.add(Human(name, gender))
            println(" $name добавлен в картотеку.")
        }
    }

    fun displayHumans() {
        for (human in listOfHumans) {
            println("Имя: ${human.name}, Пол: ${human.gender}")
        }
    }
}

fun main() {
    val catalogOfHumans1 = CatalogOfHumans()

    catalogOfHumans1.displayInstruction()
    println()
    catalogOfHumans1.addHumansInList()
    println()
    catalogOfHumans1.displayHumans()
}