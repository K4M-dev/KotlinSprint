package org.example.lesson_19

enum class Category {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategoryName(): String {

        return when(this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярия"
            MISCELLANEOUS -> "Разное"
        }
    }
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun getProductInfo() {
        println("Товар $id $name из категории ${category.getCategoryName()}")
    }
}

fun main() {

    val product1 = Product("рубашка", 1, Category.CLOTHING)
    val product2 = Product("ручка", 2, Category.STATIONERY)
    val product3 = Product("блокнот", 3, Category.STATIONERY)
    val product4 = Product("кружка", 4, Category.MISCELLANEOUS)

    product1.getProductInfo()
    product2.getProductInfo()
    product3.getProductInfo()
    product4.getProductInfo()

}