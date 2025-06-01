package org.example.lesson_17

class Package(
    private val numberOfPackage: Int,
    private var currentLocation: String,
) {

    private var locationCounter = START_COUNT

    var newLocation: String
        get() = "Посылка с номером $numberOfPackage находится в $currentLocation"
        set(value) {
            locationCounter++
            println("Посылка была доставлена в $locationCounter по счёту локацию")
            currentLocation = value
            println("Посылка с номером $numberOfPackage прибыла в $currentLocation")
        }
}

fun main() {

    val package1 = Package(3708, "Moscow")

    println(package1.newLocation)
    println()
    package1.newLocation = "St-Petersburg"
    println(package1.newLocation)
    println()
    package1.newLocation = "Vladivostok"
    println(package1.newLocation)
}

private const val START_COUNT = 0