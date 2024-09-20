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

    val stockManzana = store.checkProduct("Manzana")
    println("Stock de Manzana: $stockManzana")

    val customer1= Customer("Hiperdino", "hiperdino@gmail.com", 50)
    val customer2= Customer("Alcampo", "alcampo@gmail.com", 50)


    store.addCustomer(customer1)
    store.addCustomer(customer2)

    store.removeCustomer(customer2)

    store.doBuy(customer1, "Banana")

    store.listCustomers()
}

data class Customer(val name: String, val email: String, var loyaltyPoints: Int)

data class Product(val name: String, val price: Double, var quantity: Int)

class Store() {
    private val customerList=mutableListOf<Customer>()
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

    fun checkProduct(productName: String): Product? {
        return productsList.find { it.name == productName }
    }


    fun addCustomer(customer: Customer) {
        customerList.add(customer)
        println("Cliente ${customer.name} añadido a la lista")
    }

    fun removeCustomer(customer: Customer) {
        if (customerList.remove(customer)) {
            println("Cliente ${customer.name} eliminado con éxito.")
        } else {
            println("Cliente ${customer.name} no existe.")
        }
    }

    fun listCustomers() {
        println("Clientes de la tienda")
        for (customer in customerList) {
            println(customer)
        }
    }

    fun doBuy (customer: Customer, productName: String) {
        val product = checkProduct(productName)

        if (product != null && product.quantity > 0) {
            product.quantity -= 1
            customer.loyaltyPoints += 10
            println("${customer.name} compró 1 unidad de $productName. Puntos de lealtad ahora: ${customer.loyaltyPoints}")
        } else {
            println("El producto $productName no está disponible o está agotado.")
        }
    }
}


