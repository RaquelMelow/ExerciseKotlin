//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = 5
    val b = 7
    println("El mayor entre ambos números es ${minMax(a, b)}")
}

fun minMax(a: Int, b: Int) :Int {
    if (a > b) {
        return b
    } else {
        return a
    }
}