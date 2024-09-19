package POO

fun main(){
    val producto1 = Product("Manzana", 0.5, 100)
    val producto2 = Product("Banana", 0.3, 150)

    println(producto1)

    val store = Store()
    store.addProduct(producto1)
    store.addProduct(producto2)

    println("\nLista de productos en la tienda después de añadir:")
    store.printProducts()

    store.removeProduct(producto1)

    println("\nLista de productos en la tienda después de eliminar 'Manzana':")
    store.printProducts()



    //store.checkProducts("Manzana")
}

data class Product(val name: String, val price: Double, val quantity: Int)

class Store() {
    private val productsList = mutableListOf<Product>()

    fun addProduct(product: Product) {
        productsList.add(product)
    }

    fun removeProduct(product: Product) {
        productsList.remove(product)
    }

    fun printProducts() {
        println("Productos en la tienda:")
        for (product in productsList) {
            println(product)
        }
    }

//Verificar el stock de un producto
    //fun checkProducts(product: Product) :Any {
        //val foundPodruct = productsList.find( it.name == product.name)

           //println(foundProduct, $it.name)
    //}
}



