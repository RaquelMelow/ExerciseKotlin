fun main () {
    val myLibrary = Library()

    val book1 = Book("Titanic", "Leonardo", 2002)
    val book2 = Book("1984", "George Orwell", 1949)
    val book3 = Book("El nombre del viento", "Patrick Rothfuss", null) // Año desconocido

    myLibrary.addBook(book1)
    myLibrary.addBook(book2)
    myLibrary.addBook(book3)

    println("Mostrar todos los libros en la biblioteca:")
    myLibrary.showAllBooks()

    val count = myLibrary.year2000()
    println("\nCantidad de libros publicados antes del año 2000: $count")

    val lastestBook = myLibrary.recentlyBook()
    if (lastestBook != null) {
        println("\nEl libro más reciente es ${lastestBook.title} de ${lastestBook.author}, publicado en: ${lastestBook.year}")
    } else {
        println("\nNo hay libros en la biblioteca.")
    }

    myLibrary.editYear("1984", 2020)

}

data class Book(val title: String, val author: String, var year: Int?)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun showAllBooks() {
        for (book in books) {
            val year = book.year ?: "Año desconocido"
            println("${book.title} de ${book.author}, publicado en: $year")
        }
    }

    fun year2000(): Int {
        return books.count { it.year != null && it.year!! < 2000 }
    }

    fun recentlyBook(): Book? {
        return books.filter { it.year != null }
            .maxByOrNull { it.year!! }
    }

    fun editYear(title: String, newYear: Int?){
        val bookUpdate = books.find { it.title == title }

        if (bookUpdate != null) {
            bookUpdate.year = newYear
            println("El año de publicicación de ${bookUpdate.title} ha sido actualizado a $newYear")
        } else {
            println("Libro con título '$title' no encontrado en la biblioteca.")
        }
    }
}




