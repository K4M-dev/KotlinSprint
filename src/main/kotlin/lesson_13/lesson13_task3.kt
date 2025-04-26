package org.example.lesson_13

class Directory3(val name: String, val phone: Long, val company: String? = null) {

    fun printInfo() {
        if (company != null) {
            println("Имя: $name \nНомер телефона: $phone \nКомпания: $company")
        } else println("Имя: $name \nНомер телефона: $phone \nКомпания: <не указана>")
    }
}

fun main() {

    val directoryList = listOf(
        Directory3("Igor", 89266669212, null),
        Directory3("Masha", 89312332131, null),
        Directory3("Dima", 89773363231, "null"),
        Directory3("Oleg", 89993364320, "Яндекс"),
        Directory3("Nikita", 89331767677, "AGAVA"),
    )

    for (contact in directoryList) {
        if (contact.company != null) {
            contact.printInfo()
            println() // Для раздела
        }
    }
}