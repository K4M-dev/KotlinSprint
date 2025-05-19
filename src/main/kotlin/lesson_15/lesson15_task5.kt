package org.example.lesson_15

interface Shipping {

    fun ship()
}

interface LoadingCargoCar {

    fun loadingCargo(weight: Int)

    fun loadingCargoPassengers(count: Int)
}

interface UnloadingCargoCar {

    fun unloadingCargo(): Int

    fun unloadingCargoPassengers(): Int
}

interface LoadingCar {

    fun loadingCarPassengers(count: Int)
}

interface UnloadingCar {

    fun unloadingCarPassengers(): Int
}

interface TransportOfPassenger {

    fun transportOfPassenger()
}

class Truck(
    var passengers: Int = START_PASSENGERS,
    var capacity: Int = START_LOAD_CAPACITY,
) : LoadingCargoCar, UnloadingCargoCar, Shipping {

    override fun ship() {
        println("Производится транспортировка")
    }

    override fun loadingCargoPassengers(count: Int) {
        if (passengers + count <= MAX_PASSENGERS_CAPACITY_CARGO) {
            passengers += count
            println("В грузовик загружено $count пассажиров")
        } else println("Грузовик больше не вмещает пассажиров")
    }

    override fun unloadingCargoPassengers(): Int {
        val unloaded = passengers
        passengers = START_PASSENGERS
        println("Из грузовика выгружены $unloaded пассажиров")
        return unloaded
    }

    override fun loadingCargo(weight: Int) {
        if (capacity + weight <= MAX_CARGO_CAPACITY) {
            capacity += weight
            println("В грузовик загружено $weight тонн груза")
        } else println("Грузовик больше не вмещает груз")
    }

    override fun unloadingCargo(): Int {
        val unloaded = capacity
        capacity = START_LOAD_CAPACITY
        println("Из грузовика выгружено $unloaded тонн груза")
        return unloaded
    }
}

class PassengerCar(
    var passengers: Int = START_PASSENGERS,
) : LoadingCar, UnloadingCar, TransportOfPassenger {

    override fun transportOfPassenger() {
        println("Производится перевозка пассажиров")
    }

    override fun loadingCarPassengers(count: Int) {
        if (passengers + count <= MAX_PASSENGERS_CAPACITY_CAR) {
            passengers += count
            println("В легковую машину загружено $count пассажиров")
        } else println("Машина больше не вмещает пассажиров")
    }

    override fun unloadingCarPassengers(): Int {
        val unloaded = passengers
        passengers = START_PASSENGERS
        println("Из грузовика выгружены $unloaded пассажиров")
        return unloaded
    }
}

fun main() {

    val truck = Truck()
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()

    // Загрузка
    truck.loadingCargo(2) // загрузка 2 тонны груза
    truck.loadingCargoPassengers(1) // загрузка 1 пассажира
    passengerCar1.loadingCarPassengers(3) // загрузка 3 пассажиров
    passengerCar2.loadingCarPassengers(2) // количество пассажиров превышает лимит

    // Отправка на путь
    truck.ship()
    passengerCar1.transportOfPassenger()
    passengerCar2.transportOfPassenger()

    // Разгрузка
    truck.unloadingCargo()
    truck.unloadingCargoPassengers()
    passengerCar1.unloadingCarPassengers()
    passengerCar2.unloadingCarPassengers()

}

const val START_PASSENGERS = 0
const val START_LOAD_CAPACITY = 0
const val MAX_PASSENGERS_CAPACITY_CARGO = 1
const val MAX_PASSENGERS_CAPACITY_CAR = 3
const val MAX_CARGO_CAPACITY = 2