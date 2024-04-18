package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_author")
data class Author(
    @Column(nullable = false)
    private val name: String
) : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private lateinit var id: UUID

    @OneToMany(mappedBy = "author")
    private lateinit var books: MutableList<Book>

    constructor(id: UUID, name: String) : this(name) {
        this.id = id;
    }

    fun getId(): UUID {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getBooks(): MutableList<Book> {
        return books
    }

}
