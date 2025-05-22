package org.example.lesson_16

class Order(

    private val numberOfOrder: Int,
    private var statusOfOrder: String,
) {

    fun messageToManager() {
        println("Запрос менеджеру на смену заказа $numberOfOrder отправлен")

    }

    private fun changeStatusOfOrder() : String {
        println("Статус заказа с номером $numberOfOrder изменён")
        val newStatusOfOrder = "Готов к выдаче"
        this.statusOfOrder = newStatusOfOrder
        return statusOfOrder
    }

    fun getChangeStatusOfOrder() = changeStatusOfOrder()
}

fun main() {
    val order = Order(3213123, "Оплачен")

    order.messageToManager()
    order.getChangeStatusOfOrder()

}