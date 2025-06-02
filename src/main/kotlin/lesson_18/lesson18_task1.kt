package org.example.lesson_18

class CRM {

    fun getOrder(
        orderNumber: Int,
        item: String
    ) {
        println("Заказан товар $item, номер заказа $orderNumber")
    }

    fun getOrder(
        orderNumber: Int,
        items: List<String>,
    ) {
        println("Заказаны товары $items, номер заказа $orderNumber")
    }
}

fun main() {

    val order1 = CRM()

    order1.getOrder(3409, "Рубашка")

    order1.getOrder(3410, listOf("Кроссовки, брюки, жилетка"))
}