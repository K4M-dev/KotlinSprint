package org.example.lesson_1

const val DIVIDER_FOR_TIME = 60

fun main() {

    val seconds = 6480
    val minute = seconds / DIVIDER_FOR_TIME
    val hour = minute / DIVIDER_FOR_TIME
    val remainingSeconds = seconds % DIVIDER_FOR_TIME
    val remainingMinutes = minute % DIVIDER_FOR_TIME

    print("%02d:%02d:%02d".format(hour, remainingMinutes, remainingSeconds))
}