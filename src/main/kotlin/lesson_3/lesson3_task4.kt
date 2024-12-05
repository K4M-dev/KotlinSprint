package org.example.lesson_3

fun main() {

    var whereFrom = "E2"
    var where = "E4"
    var strokeNumber = "1"

    val blackPlayerMove = "$whereFrom:$where, $strokeNumber"

    println(blackPlayerMove)

    whereFrom = "D2"
    where = "D${2 + 1}"
    strokeNumber = "2"

    val whitePlayerMove = "$whereFrom:$where, $strokeNumber"

    println(whitePlayerMove)
}