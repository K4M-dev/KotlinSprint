package org.example.lesson_16

class Order(
    private val numberOfOrder: Int,
) {
    private var statusOfOrder: String = "В ожидании"

    fun requestStatusChange(newStatusOfOrder: String) {
        println("Запрос менеджеру на смену заказа $numberOfOrder отправлен")
        changeStatusOfOrder(newStatusOfOrder)
        println("Статус заказа с номером $numberOfOrder изменён на $newStatusOfOrder")
    }

    private fun changeStatusOfOrder(newStatusOfOrder: String) {
        statusOfOrder = newStatusOfOrder
    }
}

fun main() {

    val order = Order(3213123)

    order.requestStatusChange("\"Оплачен\"")
}