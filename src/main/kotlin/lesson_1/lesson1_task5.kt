package org.example.lesson_1

fun main() {
    val x = 60
    val seconds = 6480
    val minute = seconds / x
    val hour = minute / x
    val remainingSeconds = seconds % x
    val remainingMinutes = minute % x

    print("%02d:%02d:%02d".format(hour, remainingMinutes, remainingSeconds))
}