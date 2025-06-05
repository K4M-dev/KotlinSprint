package org.example.lesson_18

import kotlin.math.pow

open class DateOfPackage {

    open fun getArea(): Int {
        return START_METHOD
    }
}

class ParallelepipedPackage(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : DateOfPackage() {

    override fun getArea(): Int {
        return CONST_FOR_PARALLELEPIPED * (length * height + width * height + length * width)
    }
}

class CubePackage(
    private val ribLength: Double,
) : DateOfPackage() {

    override fun getArea(): Int {
        return CONST_FOR_CUBE * ribLength.pow(2.0).toInt()
    }
}

fun main() {

    val package1 = ParallelepipedPackage(3, 5, 10)
    val package2 = CubePackage(5.0)

    println(package1.getArea())
    println(package2.getArea())
}

private const val CONST_FOR_PARALLELEPIPED = 2
private const val CONST_FOR_CUBE = 6
private const val START_METHOD = 0