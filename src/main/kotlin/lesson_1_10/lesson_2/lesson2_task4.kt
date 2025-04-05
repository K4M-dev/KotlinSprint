package org.example.lesson_1_10.lesson_2

const val FULL_PERCENT = 100

fun main() {

    val defCristal = 7
    val defIron = 11
    val percentBuff = 20

    val fullCristal = ((defCristal * percentBuff) / FULL_PERCENT) + defCristal

    val fullIron = ((defIron * percentBuff) / FULL_PERCENT) + defIron

    val buffCristal = fullCristal - defCristal

    println(buffCristal)

    val buffIron = fullIron - defIron

    println(buffIron)
}