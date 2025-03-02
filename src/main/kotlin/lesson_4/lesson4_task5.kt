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

    val statusSailing = ((!damage && (crew >= MIN_CREW) && (crew <= MAX_CREW) && (weatherCondition || !weatherCondition))
            || (damage && (crew == MAX_CREW) && weatherCondition)) && (numberBoxes > MIN_NUM_BOXES)

    println("Возможна ли отправка корабля в плавание? $statusSailing")

}
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_NUM_BOXES = 50