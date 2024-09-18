package Bucles

fun main () {
    val number = 17
    if (isPrimo(number)) {
        println("$number this number is primo")
    } else {
        println("This $number is not a primo")
    }
}

fun isPrimo(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}