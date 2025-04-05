package org.example.lesson_1_10.lesson_4

fun main () {
    val bookedToday = 13
    val bookedTomorrow = 9

    val statusToday: Boolean = bookedToday < TABLES

    val statusTomorrow: Boolean = bookedTomorrow < TABLES

    println("Доступность столиков на сегодня: $statusToday\nДоступность столиков на завтра: $statusTomorrow")
}
const val TABLES = 13