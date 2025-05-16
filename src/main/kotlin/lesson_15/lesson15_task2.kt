package org.example.lesson_15

abstract class WeatherStationStats() {
    abstract fun getData(): String
}

class Temperature(val value: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура $value градусов"
    }
}

class PrecipitationAmount(val amount: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Количество осадков $amount мм"
    }
}

class WeatherServer() {
    fun sendData(weatherData: WeatherStationStats) {
        println(weatherData.getData())
    }
}

fun main() {
    val weatherServer = WeatherServer()

    val temperature = Temperature(25.0)
    val precipitationAmount = PrecipitationAmount(12.0)

    weatherServer.sendData(temperature)
    weatherServer.sendData(precipitationAmount)
}