package Funciones

fun main (){
     val num = 15
    if (divThree(num)) {
        println("$num es divisible entre 3")
    } else {
        println("$num no es divisible entre 3")
    }
}

fun divThree(num: Int) :Boolean{
    return num % 3 == 0
}