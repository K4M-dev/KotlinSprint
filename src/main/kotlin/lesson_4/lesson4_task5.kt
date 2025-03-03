package org.example.lesson_4

fun main() {

    println("Введите информацию о судне и погодных условиях")

    println("Наличие повреждений корпуса")

    val damage: Boolean = readln().toBoolean()

    println("Текущий состав экипажа")

    val crew: Int = readln().toInt()

    println("Количество ящиков с провизией на борту")

    val numberBoxes: Int = readln().toInt()

    println("Благоприятность метеоусловий")

    val weatherCondition: Boolean = readln().toBoolean()

    val trueDamage = damage
    val isWeatherGood = weatherCondition
    val isCrewValid = crew in MIN_CREW..MAX_CREW
    val enoughBoxes = numberBoxes > MIN_NUM_BOXES

    val statusSailing = ((!trueDamage && isCrewValid && (isWeatherGood || !isWeatherGood))
            || (trueDamage && (crew == MAX_CREW) && isWeatherGood)) && enoughBoxes

    println("Возможна ли отправка корабля в плавание? $statusSailing")

}
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_NUM_BOXES = 50