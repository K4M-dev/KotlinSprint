package org.example.lesson_18

import kotlin.math.pow

class DateOfPackage {

    fun getAreaOfPackage(
        length: Int,
        width: Int,
        height: Int,
    ): Int {
        val area = CONST_FOR_PARALLELEPIPED * (length * height + width * height + length * width)
        return area
    }

    fun getAreaOfPackage(
        ribLength: Double,
    ): Int {
        val area = CONST_FOR_CUBE * ribLength.pow(2.0).toInt()
        return area
    }
}

fun main() {

    val order = DateOfPackage()

    println(order.getAreaOfPackage(3, 5, 10))
    println(order.getAreaOfPackage(5.0))
}

private const val CONST_FOR_PARALLELEPIPED = 2
private const val CONST_FOR_CUBE = 6