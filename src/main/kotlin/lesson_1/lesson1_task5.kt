package org.example.lesson_1

fun main() {

    val seconds = 6480
    val minute = seconds/60
    val hour = minute/60
    val remainingSeconds = seconds%60
    val remainingMinutes = minute%60

    print("%02d".format(hour) + ":")
    print("%02d".format(remainingMinutes) + ":")
    print("%02d".format(remainingSeconds))
}