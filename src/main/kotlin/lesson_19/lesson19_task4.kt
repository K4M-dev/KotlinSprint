package org.example.lesson_19

enum class Ammunition(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {

    private var clip = DISCHARGED

    fun takeBullets(packOfBullets: Int) {
        clip += packOfBullets
    }

    fun shooting(bullets: Ammunition): String {
        return if (clip > DISCHARGED) {
            clip -= SHOT
            "Попадание! Нанесено ${bullets.damage} единиц урона"
        } else "Магазин разряжен, стрельба невозможна"
    }
}

fun main() {
    val tank1 = Tank()

    tank1.takeBullets(3)
    println(tank1.shooting(Ammunition.RED))
    println(tank1.shooting(Ammunition.GREEN))
    println(tank1.shooting(Ammunition.BLUE))
    println(tank1.shooting(Ammunition.BLUE))
}

const val DISCHARGED = 0
const val SHOT = 1