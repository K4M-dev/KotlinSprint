package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {

    val filterList = this.filter { it % 2 == 0 }
    return filterList.sumOf { it }
}

fun main() {

    val list1 = listOf(10, 11, 13, 14, 16, 31, 32)

    println(list1.evenNumbersSum())
}