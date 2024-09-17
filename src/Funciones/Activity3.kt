package Funciones

fun main() {
    val n = 4
    val resultado = sumaIterativa(n)
    println("La suma de los números del 1 al $n es: $resultado")
}

fun sumaIterativa(n: Int): Int {
    var suma = 0
    for (i in 1..n) {
        suma += i
    }
    return suma
}