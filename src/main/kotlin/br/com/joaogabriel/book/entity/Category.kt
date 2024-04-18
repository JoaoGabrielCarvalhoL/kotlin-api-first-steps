package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_category")
data class Category(
    @Column(nullable = false)
    private val name: String,
    @Column(nullable = false)
    private val description: String,

) : Serializable {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private lateinit var id: UUID
    @OneToMany(mappedBy = "category")
    private lateinit var books: MutableList<Book>

    constructor(name:String, description: String, id: UUID, books:MutableList<Book>) : this(name, description) {
        this.id = id
        this.books = books
    }

    constructor(name:String, description: String, id: UUID) : this(name, description) {
        this.id = id
    }

    fun getId(): UUID {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getDescription(): String {
        return description
    }

    fun getBooks(): MutableList<Book> {
        return books
    }

}
