package Funciones

fun main () {
    val a = "abc123"
    val b = "abc1234"
    println("El string más largo es {${maxCaracteres(a, b)}")
}

fun maxCaracteres (a: String, b: String) :String {
    if (a.length > b.length) {
        return a
    } else {
        return b
    }
}