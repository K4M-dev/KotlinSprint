package org.example.lesson_22

class RegularBook2(
    val name222: String,
    val author222: String,
)

data class DataBook2(
    val name222: String,
    val author222: String,
)

fun main() {

    val book1 = RegularBook2("GoldBook", "Aaron")
    println(book1)

    val book2 = DataBook2("SilverName", "Ember")
    println(book2)
}
//В обычных классах, для отображения самого объекта, нужно переопределять функцию toString, так как изначально
// выводится строковое представление по умолчанию, а в data классах, можно переопределить при условии, если не нравится отображение
