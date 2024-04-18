package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.net.URI
import java.util.*

@Entity
@Table(name = "tb_available")
data class Available(

    @Column(nullable = false)
    private val name: String,
    @Column(nullable = false)
    private val uri: URI,

    ) : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private lateinit var id: UUID

    @ManyToOne
    @JoinColumn(nullable = false, referencedColumnName = "id", name = "book_id")
    private lateinit var book: Book

    constructor(name: String, uri: URI, id: UUID, book: Book) : this(name, uri) {
        this.id = id;
        this.book = book;
    }

    constructor(name: String, uri: URI, id: UUID) : this(name, uri) {
        this.id = id;
    }

    constructor(name: String, uri: URI, book: Book) : this(name, uri) {
        this.book = book;
    }

    fun getId(): UUID {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getUri() : URI {
        return uri
    }

    fun getBook() : Book {
        return book
    }
}
