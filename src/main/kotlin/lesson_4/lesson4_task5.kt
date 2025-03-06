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
    val availabilityBoxes = numberBoxes > MIN_NUM_BOXES

    val statusSailing = (((trueDamage == DAMAGE_ABSENT) && (isCrewValid == ENOUGH_CREW)
            && ((isWeatherGood == WEATHER_GOOD) || (isWeatherGood == WEATHER_BAD)))
            || ((trueDamage == DAMAGE_PRESENT) && (crew == MAX_CREW) && (isWeatherGood == WEATHER_GOOD)))
            && (availabilityBoxes == ENOUGH_BOXES)

    println("Возможна ли отправка корабля в плавание? $statusSailing")

}
const val ENOUGH_CREW = true
const val ENOUGH_BOXES = true
const val DAMAGE_PRESENT = true
const val DAMAGE_ABSENT = false
const val WEATHER_GOOD = true
const val WEATHER_BAD = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_NUM_BOXES = 50