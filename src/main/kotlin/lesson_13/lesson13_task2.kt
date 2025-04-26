package org.example.lesson_13

class Directory2(val name: String, val phone: Long, val company: String? = null) {

    fun printInfo() {
        println("Имя: $name \nНомер телефона: $phone \nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val directory1 = Directory2("Igor", 79966653409, null)
    directory1.printInfo()

    val directory2 = Directory2("Ivan", 79966653612, "Яндекс")
    directory2.printInfo()
}
