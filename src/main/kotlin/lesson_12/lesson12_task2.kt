package org.example.lesson_12

class Weather2(var dayTemp: String, var nightTemp: String, var presenceOfPrecipitation: Boolean) {

    fun printInfo() {
        println("Дневная температура: $dayTemp \nНочная температура: $nightTemp " +
                "\nНаличие осадков: $presenceOfPrecipitation")
    }
}

fun main() {

    val weather1 = Weather2("25 градусов", "12 градусов", false)
    weather1.printInfo()

    val weather2 = Weather2("12 градусов", "3 градусов", true)
    weather2.printInfo()
}
