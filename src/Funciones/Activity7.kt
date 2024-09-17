package Funciones

fun main () {
    val vocal = 'a'
    println("Es vocal: ${isVocal(vocal)}")
}

fun isVocal (a: Char) : Boolean {
    val caracter = a.uppercase()
    val vocals = listOf("A", "E", "I", "O", "U")
   return caracter in vocals
}