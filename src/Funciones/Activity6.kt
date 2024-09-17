package Funciones

fun main() {
    val nums = intArrayOf(3, 5, 8)
    println("El número promedio de ${nums.contentToString()} es ${retMed(nums)}")
}

fun retMed(a: IntArray): Int {
    var sum = 0
    for (num in a) {
        sum += num
    }
    return sum / a.size
}