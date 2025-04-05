package org.example.lesson_1_10.lesson_4

fun main() {

    val minAvgWeight = 35
    val maxAvgWeight = 100
    val maxAvgCapacity = 100

    val weightFirst = 20
    val capacityFirst = 80

    println(
        "Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': " +
                ((weightFirst > minAvgWeight) && (weightFirst <= maxAvgWeight) && (capacityFirst < maxAvgCapacity))
    )

    val weightSec = 50
    val capacitySec = 100

    println(
        "Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
                ((weightSec > minAvgWeight) && (weightSec <= maxAvgWeight) && (capacitySec < maxAvgCapacity))
    )


}