package com.example.introkotlin_901.temaskotlin

fun main(){
    println("Ingrese los valores necesarios para la formula general")
    println("Ingresa el valor de a: ")
    val a = readln().toDouble()
    println("Ingresa el valor de b: ")
    val b = readln().toDouble()
    println("Ingresa el valor de c: ")
    val c = readln().toDouble()

    val discriminant = b * b - 4 * a * c

    if (discriminant >= 0) {
        val root1 = (-b + Math.sqrt(discriminant)) / (2 * a)
        val root2 = (-b - Math.sqrt(discriminant)) / (2 * a)
        println("Las raices son: $root1 y $root2")
    } else {
        println("La ecuacion no tiene raices reales.")
    }


}