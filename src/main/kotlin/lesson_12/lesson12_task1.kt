package org.example.lesson_12

class Weather() {

    var dayTemp = "24 градуса"
    var nightTemp = "9 градусов"
    var presenceOfPrecipitation = false

}

fun main() {

    val weather1 = Weather()
    weather1.dayTemp = "12 градусов"
    weather1.nightTemp = "5 градусов"
    weather1.presenceOfPrecipitation = true
    println(weather1.dayTemp)
    println(weather1.nightTemp)
    println(weather1.presenceOfPrecipitation)

    val weather2 = Weather()
    weather2.dayTemp = "15 градусов"
    weather2.nightTemp = "10 градусов"
    weather2.presenceOfPrecipitation = false
    println(weather2.dayTemp)
    println(weather2.nightTemp)
    println(weather2.presenceOfPrecipitation)
}