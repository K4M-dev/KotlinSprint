package org.example.lesson_12

class Weather2(var dayTemp: String, var nightTemp: String, var presenceOfPrecipitation: Boolean)

fun main() {

    val weather1 = Weather2("25 градусов", "12 градусов", false)
    println(weather1.dayTemp)
    println(weather1.nightTemp)
    println(weather1.presenceOfPrecipitation)

    val weather2 = Weather2("12 градусов", "3 градусов", true)
    println(weather2.dayTemp)
    println(weather2.nightTemp)
    println(weather2.presenceOfPrecipitation)
}
