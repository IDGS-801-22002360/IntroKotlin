package com.example.introkotlin_901.temaskotlin

import kotlinx.coroutines.processNextEventInCurrentThread

fun main() {

    val d: Int
    val e = true
    if (e) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    val numero = if (e) 1 else 2
    println(numero)

//-------------------------

    println("Ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if (sueldo > 3000){
        println("debe pagar impuestos")
    }else{
        println("No debe pagar impuestos")
    }

    //---------------------

    val objeto : Any = "Hola"
    when (objeto){
        "1"-> println("Es un uno")
        "Hola" -> println("Es un Saludo")
        is String -> println("Es un String")
        else -> println("No se que es")
    }


//Range
//------------------------------
    1 .. 4 // 1,2,3,4
    4 downTo 1 // 4,3,2,1
    1 .. 10 step 2 // 1,3,5,7,9
    'a' .. 'g'



}