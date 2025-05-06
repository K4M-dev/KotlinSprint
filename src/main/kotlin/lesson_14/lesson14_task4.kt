package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val presenceOfAtmosphere: Boolean,
    val suitabilityForLanding: Boolean,
) {
    open fun printInfo(): String {
        return "Небесное тело: $name\nВозможность высадки: $suitabilityForLanding\nНаличие атмосферы: $presenceOfAtmosphere "
    }
}

class Satellite(
    name: String,
    presenceOfAtmosphere: Boolean,
    suitabilityForLanding: Boolean,
    val planetOrbiting: String,
) : CelestialBody(name, presenceOfAtmosphere, suitabilityForLanding) {
    override fun printInfo(): String {
        return super.printInfo() + "\nСпутник планеты: $planetOrbiting"
    }
}

class Planet(
    name: String,
    presenceOfAtmosphere: Boolean,
    suitabilityForLanding: Boolean,
    val satelliteList: MutableList<Satellite> = mutableListOf(),
) : CelestialBody(name, presenceOfAtmosphere, suitabilityForLanding) {
    override fun printInfo(): String {
        return super.printInfo() + "\nСпутники: ${satelliteList.size}\n"
    }

    fun addSatellite(satellite: Satellite) {
        satelliteList.add(satellite)
    }

    fun getSatellites(): List<Satellite> {
        return satelliteList.toList()
    }
}

fun main() {
    val planet1 = Planet("Юпитер", true, true)
    val satellite1 = Satellite("Ио", true, false, "Юпитер")
    val satellite2 = Satellite("Европа", true, false, "Юпитер")

    planet1.addSatellite(satellite1)
    planet1.addSatellite(satellite2)

    println(planet1.printInfo())
    println("Спутники планеты ${planet1.name}:")
    for (satellite in planet1.getSatellites()) {
        println("${satellite.printInfo()}\n")
    }
}