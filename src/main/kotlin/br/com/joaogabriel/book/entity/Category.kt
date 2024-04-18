package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_category")
data class Category(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID,
    @Column(nullable = false)
    private val name: String,
    @Column(nullable = false)
    private val description: String,
    @OneToMany(mappedBy = "category")
    private val books: MutableList<Book>

) : Serializable {

}
