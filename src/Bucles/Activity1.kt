package Bucles

fun main() {
    val age = 19
    println("Usted es ${agesPerson(age)}")
}

fun agesPerson (age: Int) :String {
    if (age > 18) {
        return "Mayor de edad"
    } else {
        return  "Menor de edad"
    }
}