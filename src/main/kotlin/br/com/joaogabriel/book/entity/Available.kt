package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.net.URI
import java.util.*

@Entity
@Table(name = "tb_available")
data class Available(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID,
    @Column(nullable = false)
    private val name: String,
    @Column(nullable = false)
    private val uri: URI,
    @ManyToOne
    @JoinColumn(nullable = false, referencedColumnName = "id", name = "book_id")
    private val book: Book
) : Serializable
