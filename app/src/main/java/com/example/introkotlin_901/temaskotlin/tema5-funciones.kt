package com.example.introkotlin_901.temaskotlin

fun saludo(){
    return println("Hola mundo")
}

fun sum( x: Int, y: Int):Int {
    return x + y
}

fun sum2(x:Int, y:Int):Int = x + y

fun main(){
    saludo()
    println("____________________________________________________"+"")
    println(sum(2,3))
    println(sum2(2,3))
}


