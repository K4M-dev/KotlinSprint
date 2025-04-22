package org.example.lesson_12


class Weather4(_dayTemp: Int, _nightTemp: Int, _presenceOfPrecipitation: Boolean) {

    var dayTemp = _dayTemp - KELVINS_TO_CELSIUS
    var nightTemp = _nightTemp - KELVINS_TO_CELSIUS
    var presenceOfPrecipitation = _presenceOfPrecipitation

    init {
        println(dayTemp)
        println(nightTemp)
        println(presenceOfPrecipitation)
    }

}

fun main() {

    val weather1 = Weather4(295, 292, true)

}

const val KELVINS_TO_CELSIUS = 273
