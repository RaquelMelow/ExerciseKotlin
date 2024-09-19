package Bucles

fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    val result = sumList(nums)
    println("${result}")
}

fun sumList(nums: List<Int>) :Int {
    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum
}