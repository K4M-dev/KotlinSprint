package org.example.lesson_18

class Screen {

    fun draw(
        x : Int,
        y: Int,
    ): String {
        return "Была нарисован круг в координатах $x, $y"
    }

    fun draw(
        x: Float,
        y: Int,
    ): String {
        return "Был нарисован квадрат в координатах $x, $y"
    }

    fun draw(
        x: Float,
        y: Float,
    ): String {
        return "Была нарисована точка в координатах $x, $y"
    }
}

fun main() {

    val draw = Screen()

    println(draw.draw(2,6))
    println(draw.draw(2.0f, 2))
    println(draw.draw(3.25f, 3.76f))
}



