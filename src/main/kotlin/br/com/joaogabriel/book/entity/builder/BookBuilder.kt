package br.com.joaogabriel.book.entity.builder

import br.com.joaogabriel.book.entity.Author
import br.com.joaogabriel.book.entity.Available
import br.com.joaogabriel.book.entity.Book
import br.com.joaogabriel.book.entity.Category
import java.util.*
import kotlin.reflect.full.createInstance

class BookBuilder {
    private val book: Book = Book::class.createInstance()

    fun username(username: String) : BookBuilder {
        this.book
        return this
    }

    fun id(id: UUID) : BookBuilder {
        this.book.setId(id)
        return this
    }

    fun title(title: String) : BookBuilder {
        this.book.setTitle(title)
        return this
    }

    fun description(description: String) : BookBuilder {
        this.book.setDescription(description)
        return this
    }

    fun bookCover(bookCover: ByteArray) : BookBuilder {
        this.book.setBookCover(bookCover)
        return this
    }

    fun category(category: Category) : BookBuilder {
        this.book.setCategory(category)
        return this
    }

    fun author(author: Author) : BookBuilder {
        this.book.setAuthor(author)
        return this
    }

    fun available(available: MutableList<Available>) : BookBuilder {
        this.book.setAvailable(available)
        return this
    }

    fun build() : Book {
        return this.book
    }
}