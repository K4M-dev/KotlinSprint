package org.example.lesson_1

const val secondsInMinute = 60
const val minutsInHour = 60

fun main() {

    val seconds = 6480
    val minute = seconds / secondsInMinute
    val hour = minute / minutsInHour
    val remainingSeconds = seconds % secondsInMinute
    val remainingMinutes = minute % minutsInHour

    print("%02d:%02d:%02d".format(hour, remainingMinutes, remainingSeconds))
}