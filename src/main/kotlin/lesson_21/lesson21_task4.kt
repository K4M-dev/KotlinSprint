package org.example.lesson_21

import java.io.File

fun File.writeWord() {

    if (!exists()) createNewFile()
    val content = readText()

    val word = "START\n"
    writeText((word + content).lowercase())
}

fun main() {

    val file = File("WordFile.txt")

    file.writeWord()
}