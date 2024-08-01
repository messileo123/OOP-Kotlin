class publiclibray:library(){
    private val book = mutableListOf<book>()
    override fun addBook(book: Book) {
       book.add(book)
    }

    override fun viewAllBooks() {
        for(book in book){
            println("title:${book.title}")
            println("author:${book.author}")
            println("year:${book.year}")
        }
    }

    override fun findBooksByAuthor(author: String) {
        for(book in book){
            if(book.author==author){
                println("title:${book.title}")
                println("author:${book.author}")
                println("year:${book.year}")

            }
        }
    }

}