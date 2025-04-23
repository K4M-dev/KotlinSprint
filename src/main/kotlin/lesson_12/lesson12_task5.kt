package org.example.lesson_12

import kotlin.random.Random

class Weather5(_dayTemp: Int, _nightTemp: Int, _presenceOfPrecipitation: Boolean) {

    var dayTemp = _dayTemp - KELVIN_TO_CELSIUS_5
    var nightTemp = _nightTemp - KELVIN_TO_CELSIUS_5
    var presenceOfPrecipitation = _presenceOfPrecipitation
}

fun main() {

    val weatherList: MutableList<Weather5> = mutableListOf()
    var objects = OBJECTS_ZERO
    while (objects < OBJECTS_MAX) {
        val weather = Weather5(Random.nextInt(273, 308), Random.nextInt(273, 308), Random.nextBoolean())
        objects++
        weatherList.add(weather)
    }
    val daysWithPrecipitation = weatherList.count { it.presenceOfPrecipitation }
    val avgDayTemp = weatherList.map { it.dayTemp }.average()
    val avgNightTemp = weatherList.map { it.nightTemp }.average()

    println(avgDayTemp)
    println(avgNightTemp)
    println(daysWithPrecipitation)

}

const val KELVIN_TO_CELSIUS_5 = 273
const val OBJECTS_ZERO = 0
const val OBJECTS_MAX = 30