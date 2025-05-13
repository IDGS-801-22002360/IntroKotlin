package com.example.introkotlin_901.temaskotlin

import kotlin.math.pow
import kotlin.math.PI

abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
}

class Cuadrado(private val lado: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double = lado.pow(2)
}

class Triangulo(private val base: Double, private val altura: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double = (base * altura) / 2
}

class Pentagono(private val lado: Double, private val apotema: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double = ((lado * 5) * apotema) / 2
}

class Circulo(private val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double = PI * radio.pow(2)
}

fun main() {
    var opcion: Int

    do {
        println("____________________________________________________")
        println("1. Cuadrado")
        println("2. Triingulo")
        println("3. Pentagono")
        println("4. Circulo")
        println("5. Salir")
        print("Seleccione una opcion: ")

        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Ingrese el lado del cuadrado: ")
                val lado = readLine()!!.toDouble()
                val cuadrado = Cuadrado(lado)
                println("El area del cuadrado es: ${cuadrado.calcularArea()}")
            }

            2 -> {
                print("Ingrese la base del triangulo: ")
                val base = readLine()!!.toDouble()
                print("Ingrese la altura del triangulo: ")
                val altura = readLine()!!.toDouble()
                val triangulo = Triangulo(base, altura)
                println("El area del triangulo es: ${triangulo.calcularArea()}")
            }

            3 -> {
                print("Ingrese el lado del pentagono: ")
                val lado = readLine()!!.toDouble()
                print("Ingrese la apotema del pentagono: ")
                val apotema = readLine()!!.toDouble()
                val pentagono = Pentagono(lado, apotema)
                println("El area del pentagono es: ${pentagono.calcularArea()}")
            }

            4 -> {
                print("Ingrese el radio del circulo: ")
                val radio = readLine()!!.toDouble()
                val circulo = Circulo(radio)
                println("El area del circulo es: ${circulo.calcularArea()}")
            }

            5 -> println("Saliendo del programa...")

            else -> println("Opción invaalida. Intente de nuevo.")
        }

    } while (opcion != 5)
}
