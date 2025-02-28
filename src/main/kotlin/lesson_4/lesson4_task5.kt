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

    val statusSailing = ((!damage && (crew >= 55) && (crew <= 70) && (weatherCondition or !weatherCondition))
            || (damage && (crew == 70) && weatherCondition)) && (numberBoxes > 50)

    println("Возможна ли отправка корабля в плавание? $statusSailing")

}