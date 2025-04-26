package org.example.lesson_13

class Directory(val name: String, val phone: Long, val company: String?) {

    fun printInfo() {
        println("Имя: $name \nНомер телефона: $phone \nКомпания: $company")
    }
}

fun main() {

    val directory1 = Directory("Igor", 79966653409, null)
    directory1.printInfo()

    val directory2 = Directory("Ivan", 79966653612, "Яндекс")
    directory2.printInfo()
}