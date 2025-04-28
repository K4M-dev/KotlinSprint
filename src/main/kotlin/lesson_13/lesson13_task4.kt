package org.example.lesson_13

class Directory4(val name: String, var phone: Long, var company: String? = null) {

    fun printInfo() {
            println("Имя: $name \nНомер телефона: $phone \nКомпания: ${company ?: "<не указано>"}")
    }
}

class ManageContacts {
    private val contactsList: MutableList<Directory4> = mutableListOf()

    fun addContact(contact: Directory4) {
        contactsList.add(contact)
    }

    fun printContacts() {
        for (contact in contactsList ) {
            contact.printInfo()
            println()
        }
    }

}

fun main() {

    val phoneBook = ManageContacts()

    println("Введите количество контактов, которые вы хотите добавить:")
    val numberOfContacts = readln().toIntOrNull() ?: return println("Некоректный ввод")

    for (i in 1..numberOfContacts) {
        println("Введите имя контакта:")
        val name = readln()

        println("Введите номер телефона:")
        val phone = readln().toLongOrNull() ?: return println("Номер телефона не может быть пустым.")

        println("Введите компанию (или оставьте пустым):")
        val company = readlnOrNull()?.takeIf { it.isNotBlank() }

        phoneBook.addContact(Directory4(name, phone, company))
    }

    phoneBook.printContacts()

}

