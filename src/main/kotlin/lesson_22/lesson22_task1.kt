package org.example.lesson_22

class RegularBook(
    val name22: String,
    val author22: String,
)

data class DataBook(
    val name22: String,
    val author22: String,
)

fun main() {

    val book1 = RegularBook("ABC", "Gustav")
    val book2 = RegularBook("ABC", "Gustav")
    println(book1 == book2) // false, так как сравниваются ссылки на объекты, а не их значения, как в data классах

    val book3 = DataBook("Iron", "Oleg")
    val book4 = DataBook("Iron", "Oleg")
    println(book3 == book4) // true, так как сравниваются именно иниц. данные объектов
}