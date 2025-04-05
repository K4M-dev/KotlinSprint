package org.example.lesson_1_10.lesson_2

fun main() {

    val numberOfEmployees = 50
    val numberOfTrainees = 30
    val salaryOfEmployees = 30000
    val salaryOfTrainees = 20000

    val PaymentCostsEployees: Int = numberOfEmployees * salaryOfEmployees

    println(PaymentCostsEployees)

    val fullPaymentCosts: Int = PaymentCostsEployees + (numberOfTrainees * salaryOfTrainees)

    println(fullPaymentCosts)

    val avgSalary: Int = fullPaymentCosts / (numberOfTrainees + numberOfEmployees)

    println(avgSalary)

}