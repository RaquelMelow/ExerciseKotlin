package POO

fun main () {
    val myLibrary = Library()

    val book1 = Book("Titanic", "Leonardo", 2002)
    val book2 = Book("1984", "George Orwell", 1949)

    myLibrary.addBook(book1)
    myLibrary.addBook(book2)

    println("Show all the book in this library: ")
    myLibrary.showAllBooks()


}

class Book(val titule: String,val autor: String,val year: Int) {
    fun showBook() {
        println("Titule: $titule \n Autor: $autor \n Year: $year")
    }
}

class Library {
    private val books = mutableListOf<Book>()
     fun addBook(book: Book) {
         books.add(book)
     }

    fun showAllBooks() {
        for (book in books) {
            book.showBook()
        }
    }
}



