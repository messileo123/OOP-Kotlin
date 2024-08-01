
data class Book(val title: String, val author: String, val year: Int) {
    fun add(book: Book) {

    }
}

abstract class Library {
    abstract fun addBook(book: Book)
    abstract fun viewAllBooks()
    abstract fun findBooksByAuthor(author: String)
}

class PublicLibrary : Library() {

    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun viewAllBooks() {
        if (books.isEmpty()) {
            println("No books in the library.")
        } else {
            books.forEach { book ->
                println("Title: ${book.title}, Author: ${book.author}, Year: ${book.year}")
            }
        }
    }

    override fun findBooksByAuthor(author: String) {
        val foundBooks = books.filter { it.author.equals(author, ignoreCase = true) }
        if (foundBooks.isEmpty()) {
            println("No books found by author $author.")
        } else {
            foundBooks.forEach { book ->
                println("Title: ${book.title}, Year: ${book.year}")
            }
        }
    }
}



