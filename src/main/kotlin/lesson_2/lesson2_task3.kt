package org.example.lesson_2

const val DIVIDER_FOR_TIME = 60

fun main() {

    val hoursStart = 9
    val MinutesStart = 39
    val travelTimeMinutes = 457

    val travelTimeHours = travelTimeMinutes / DIVIDER_FOR_TIME
    val remainingMinutes = travelTimeMinutes % DIVIDER_FOR_TIME
    val hoursEnd = (hoursStart + travelTimeHours) + (MinutesStart + remainingMinutes) / DIVIDER_FOR_TIME
    val minutesEnd = (MinutesStart + remainingMinutes) % DIVIDER_FOR_TIME


    println("%02d:%02d".format(hoursEnd, minutesEnd))
}