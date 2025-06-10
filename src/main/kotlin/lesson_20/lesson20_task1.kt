package org.example.lesson_20

fun main() {

    val printHappyNewYear: (String) -> String = { username: String -> "С наступающим Новым годом, $username!" }

    println(printHappyNewYear("Alex"))

}