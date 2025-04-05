package org.example.lesson_1_10.lesson_3

fun main() {

    var lastName = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var age = "20"

    val data = "$lastName $firstName $patronymic, $age"

    println(data)

    age = "22"
    lastName = "Сидорова"

    val newData = "$lastName $firstName $patronymic, $age"

    println(newData)
}