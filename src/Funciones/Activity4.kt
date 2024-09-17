package Funciones

fun main() {
    val palabra = "Hola"

    println("La palabra $palabra contiene ${contarVocales(palabra)} vocales.")
}

fun contarVocales(palabra: String): Int {
    val vocales = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var contador = 0

    for (caracter in palabra) {
        if (caracter in vocales) {
            contador++
        }
    }
    return contador
}