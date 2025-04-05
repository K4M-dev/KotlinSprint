package org.example.lesson_1_10.lesson_5

fun main() {
    println("Введите расстояние поездки (в км)")

    val distance: Double = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах)")

    val fuelConsumption: Double = readln().toDouble()

    println("Введите текущую стоимость топлива за литр")

    val fuelPrice: Double = readln().toDouble()

    val fuelForTrip: Double = (distance * fuelConsumption) / LITERS_PER_100KM

    val fullFuelPrice = fuelForTrip * fuelPrice

    println("Общее количество необходимого топлива: $fuelForTrip")
    println("Стоимость поездки: ${"%.2f".format(fullFuelPrice)}")
}

const val LITERS_PER_100KM = 100