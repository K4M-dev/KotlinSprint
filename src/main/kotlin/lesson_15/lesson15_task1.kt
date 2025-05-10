package org.example.lesson_15

interface Flight {

    fun flight()
}

interface Swimming {
    
    fun swim()
}

interface Walking {

    fun walk()
}

class Crucian() : Swimming {

    override fun swim() {
        println("Карась плывёт")
    }
}

class Seagull() : Flight {

    override fun flight() {
        println("Чайка летит")
    }
}

class Duck() : Walking,Flight,Swimming {

    override fun swim() {
        println("Утка плывёт")
    }

    override fun flight() {
        println("Утка летит")
    }

    override fun walk() {
        println("Утка ходит")
    }
}

fun main() {

    val crucian = Crucian()
    crucian.swim()

    val seagull = Seagull()
    seagull.flight()

    val duck = Duck()
    duck.swim()
    duck.flight()
    duck.walk()

}
