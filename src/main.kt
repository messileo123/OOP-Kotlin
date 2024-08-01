fun main() {

    var library = PublicLibrary()

    library.addBook(Book(title = "2024", author = "aksha a tara", year = 2024))
    library.addBook(Book("di maria drop", "lio messi", 2040))
    library.addBook(Book("kawsar World", "kawsar gallary", 2024))

    println("All books in the library:")
    library.viewAllBooks()
    println()


}

