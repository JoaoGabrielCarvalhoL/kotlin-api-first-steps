package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_author")
data class Author(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID,
    @Column(nullable = false)
    private val name: String,
    @OneToMany(mappedBy = "author")
    private val books: MutableList<Book>
) : Serializable {

}
