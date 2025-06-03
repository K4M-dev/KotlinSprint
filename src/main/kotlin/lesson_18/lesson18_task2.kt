package org.example.lesson_18

import kotlin.random.Random

open class GamingDice {

    open fun getDiceResult() {
        val result: Int = START_DICE
        println("Кости брошены, выпало число $result")
    }
}

class SmallDice(
    private val edges: Int = 4,
) : GamingDice() {
    override fun getDiceResult() {
        val result = Random.nextInt(FIRST_EDGE, edges)
        println("Кости с 4-мя гранями брошены, выпало число $result")
    }
}

class MediumDice(
    private val edges: Int = 6,
) : GamingDice() {
    override fun getDiceResult() {
        val result = Random.nextInt(FIRST_EDGE, edges)
        println("Кости с 6-ю гранями брошены, выпало число $result")
    }
}

class BigDice(
    private val edges: Int = 8,
) : GamingDice() {
    override fun getDiceResult() {
        val result = Random.nextInt(FIRST_EDGE, edges)
        println("Кости с 8-ю гранями брошены, выпало число $result")
    }
}

fun main() {

    val dice4: GamingDice = SmallDice()

    val dice6: GamingDice = MediumDice()

    val dice8: GamingDice = BigDice()

    val listOfDice = listOf<GamingDice>(dice4, dice6, dice8)
    showAllResults(listOfDice)
}

fun showAllResults(results: List<GamingDice>) {
    results.forEach {
        it.getDiceResult()
    }
}

private const val START_DICE = 0
private const val FIRST_EDGE = 1