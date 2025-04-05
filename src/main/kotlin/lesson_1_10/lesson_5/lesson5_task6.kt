package org.example.lesson_1_10.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите массу своего тела")

    val weight = readln().toDouble()

    println("Введите свой рост")

    val height = readln().toDouble()

    val heightInMeters = height / FOR_METERS

    val imt: Double = weight / (heightInMeters).pow(2)

    val categoryValid = when {
        imt < MIN_IMT -> "Недостаточная масса тела"
        (imt >= MIN_IMT) && (imt < NORMAL_IMT) -> "Нормальная масса тела"
        (imt >= NORMAL_IMT) && (imt < MAX_IMT) -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш индекс массы тела: ${"%.2f".format(imt)}")
    println("Ваша категория ИМТ: $categoryValid")

}

const val FOR_METERS = 100
const val MIN_IMT: Double = 18.50
const val NORMAL_IMT: Double = 25.00
const val MAX_IMT: Double = 30.00