package org.example.lesson_1

const val divider = 60

fun main() {

    val seconds = 6480
    val minute = seconds / divider
    val hour = minute / divider
    val remainingSeconds = seconds % divider
    val remainingMinutes = minute % divider

    print("%02d:%02d:%02d".format(hour, remainingMinutes, remainingSeconds))
}