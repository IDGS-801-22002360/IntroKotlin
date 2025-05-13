package com.example.introkotlin_901.temaskotlin

fun main() {
    print("Ingrese un numero: ")
    val altura = readLine()?.toIntOrNull()

    if (altura != null && altura > 0) {
        for (i in 1..altura) {
            val asteriscos = "*".repeat(2 * i - 1)

            println(asteriscos)
        }
    }
}


