package Bucles

fun main () {
    val note = 85
    println("Tu calificacion es ${note}")
    notes(note)
}

fun notes (note: Int) {
    when (note) {
        in 0..49 -> println("Suspenso")
        in 50..69 -> println("Aprobado")
        in 70..89 -> println("Notable")
        in 90..100 -> println("Sobresaliente")

        else -> println("Nota invalida")
    }
}