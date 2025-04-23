package org.example.lesson_12

class Weather3(_dayTemp: Int, _nightTemp: Int, _presenceOfPrecipitation: Boolean) {

    val dayTemp = _dayTemp - KELVIN_TO_CELSIUS
    val nightTemp = _nightTemp - KELVIN_TO_CELSIUS
    val presenceOfPrecipitation = _presenceOfPrecipitation

    fun printInfo3() {
        println("Дневная температура: $dayTemp \nНочная температура: $nightTemp " +
                "\nНаличие осадков: $presenceOfPrecipitation")
    }

}

fun main() {

    val weather1 = Weather3(295, 292, true)
    weather1.printInfo3()
}

const val KELVIN_TO_CELSIUS = 273
