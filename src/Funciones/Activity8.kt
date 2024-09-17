package Funciones

fun main (){
    val euro = 15.5f

    println("El cambio a dolares seria ${changeMoney(euro)}")
}

fun changeMoney(euro: Float) :Float{

    val change = euro * 1.2f
    return change


}