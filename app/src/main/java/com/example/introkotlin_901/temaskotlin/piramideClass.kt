package com.example.introkotlin_901.temaskotlin

class Piramide(private val altura: Int) {

    fun dibujar() {
        for (i in 1..altura) {
            val asteriscos = "*".repeat(2 * i - 1)
            println(asteriscos)
        }
    }
}

fun main() {
    print("Ingrese un numero: ")
    val altura = readLine()?.toIntOrNull()

    if (altura != null && altura > 0) {
        val piramide = Piramide(altura)
        piramide.dibujar()
    } else {
        println("Ingresa un numero mayor a 0")
    }
}
