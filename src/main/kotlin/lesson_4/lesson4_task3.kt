package org.example.lesson_4

fun main() {

    val sunDayNow = true
    val outdoorAwningNow = true
    val airHumidityNow = 20
    val seasonNow = "Зима"

    val conditionsStatus: Boolean =
        (airHumidityNow == AIR_HUMIDITY) && (outdoorAwningNow == OUTDOOR_AWNING) && (seasonNow == SEASON) && (sunDayNow == SUN_DAY)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsStatus.")

}

const val SUN_DAY: Boolean = true
const val OUTDOOR_AWNING: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON: String = "Не зима"
