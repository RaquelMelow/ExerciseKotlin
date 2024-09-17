package Funciones

fun main () {
    val dias = 3
    println("El número de $dias sería un total de ${diasEnHoras(dias)}")
}

fun diasEnHoras (a :Int) :Int {
    return a * 24
}