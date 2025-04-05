package org.example.lesson_1_10.lesson_3

fun main() {

    val playerMove = "D2-D4;0"

    val parts = playerMove.split("-", ";")

    val whereFrom = parts[0]

    println(whereFrom)

    val where = parts[1]

    println(where)

    val strokeNumber = parts[2]

    println(strokeNumber)

}