package org.example.lesson_12

class Weather3(_dayTemp: Int, _nightTemp: Int, _presenceOfPrecipitation: Boolean) {

    var dayTemp = _dayTemp - KELVIN_TO_CELSIUS
    var nightTemp = _nightTemp - KELVIN_TO_CELSIUS
    var presenceOfPrecipitation = _presenceOfPrecipitation

}

fun main() {

    val weather1 = Weather3(295, 292, true)
    println(weather1.dayTemp)
    println(weather1.nightTemp)
    println(weather1.presenceOfPrecipitation)
}

const val KELVIN_TO_CELSIUS = 273
