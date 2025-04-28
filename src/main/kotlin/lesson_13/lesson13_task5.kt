package org.example.lesson_13

class Directory5(val name: String, val phone: Long, val company: String? = null) {

    fun printInfo() {
        println("Имя: $name \nНомер телефона: $phone \nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phone: Long

    try {
        phone = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Некорректный ввод. ${e.javaClass.simpleName} : ${e.message}")
        return
    }

    val contact = Directory5("Alex", phone, "company")
    contact.printInfo()

}