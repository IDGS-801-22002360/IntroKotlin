package com.example.introkotlin_901.temaskotlin

import kotlin.math.sqrt

class EcuacionCuadratica(private val a: Double, private val b: Double, private val c: Double) {

    fun calcularRaices() {
        val discriminante = b * b - 4 * a * c

        if (discriminante > 0) {
            val raiz1 = (-b + sqrt(discriminante)) / (2 * a)
            val raiz2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Las raices reales son: $raiz1 y $raiz2")
        } else if (discriminante == 0.0) {
            val raiz = -b / (2 * a)
            println("La ecuación tiene una raiz doble: $raiz")
        } else {
            println("La ecuación no tiene raíces reales.")
        }
    }
}

fun main() {
    println("Ingrese los valores necesarios para la formula general")

    print("Ingresa el valor de a: ")
    val a = readLine()!!.toDouble()

    print("Ingresa el valor de b: ")
    val b = readLine()!!.toDouble()

    print("Ingresa el valor de c: ")
    val c = readLine()!!.toDouble()

    val ecuacion = EcuacionCuadratica(a, b, c)
    ecuacion.calcularRaices()
}
