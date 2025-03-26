package org.example.lesson_9

fun main() {

    val onePortionList = mutableListOf(2, 50, 15)

    println("Введите количество порций")

    val numberOfServings = readln().toInt()

    val morePortionList = onePortionList.map {
        it * numberOfServings
    }

    println(
        "На $numberOfServings порций вам понадобится: Яиц – ${morePortionList[0]} шт, " +
                "молока – ${morePortionList[1]} мл, сливочного масла – ${morePortionList[2]} гр."
    )
}