package Funciones

fun main () {
    val num = 77
    println("La cantidad de digitos que tiene es ${retNum(num)}")
}

fun retNum (num: Int) :Int{
    return num.toString().length
}