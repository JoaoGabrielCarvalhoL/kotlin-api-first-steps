package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_book")
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID,
    @Column(nullable = false)
    private val title: String,
    @Column(nullable = false)
    private val description: String,
    @Column(nullable = true)
    private var bookCover: ByteArray?,
    @JoinColumn(nullable = false, referencedColumnName = "id", name = "category_id")
    @ManyToOne(cascade = [CascadeType.PERSIST], fetch = FetchType.EAGER)
    private val category: Category,
    @JoinColumn(nullable = false, referencedColumnName = "id", name = "author_id")
    @ManyToOne(cascade = [CascadeType.PERSIST], fetch = FetchType.EAGER)
    private val author: Author,
    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = [CascadeType.PERSIST])
    private val available: MutableList<Available>

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
