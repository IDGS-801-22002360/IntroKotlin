package com.example.introkotlin_901.temaskotlin
import kotlin.math.pow

import android.widget.Switch

/*
* sacar el area de las figuras geometricas, un cuadrado, triangulo, pentagono y circulo
*
* debe de mostrar un menu para elegir la figura y la opcion para calcular otra area
* */

fun main(){

    var opcion = 0

    while (opcion!=5) {
        println("Menu de figuras geometricas")
        println("1. Cuadrado")
        println("2. Triangulo")
        println("3. Pentagono")
        println("4. Circulo")
        println("5. Salir")

        print("Ingrese la opcion: ")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Ingrese la medida del lado cuadrado: ")
                var lado = readLine()!!.toDouble()
                println("El area del cuadrado es: ${lado.pow(2)}")
            }

            2 -> {
                println("Ingrese la medida del lado triangulo: ")
                var lado = readLine()!!.toDouble()
                println("Ingrese la altura del triangulo: ")
                var altura = readLine()!!.toDouble()
                println("El area del triangulo es: ${(lado * altura) / 2}")

            }

            3 -> {
                println("Ingrese la medida del lado")
                var lado = readLine()!!.toDouble()
                println("Ingrese la medida de la apotema")
                var apotema = readLine()!!.toDouble()
                println("El area del pentagono es: ${((lado * 5) * apotema) / 2}")
            }

            4 -> {
                println("Ingrese el radio del circulo: ")
                var radio = readLine()!!.toDouble()
                println("El area del circulo es: ${Math.PI * radio.pow(2)}")
            }
        }
    }
}