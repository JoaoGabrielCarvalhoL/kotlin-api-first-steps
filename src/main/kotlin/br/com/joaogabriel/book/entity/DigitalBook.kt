package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_digital_book")
data class DigitalBook(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID,
    @Column(nullable = false)
    private val title: String,
    @Column(nullable = false)
    private val description: String,
    @Lob
    private val file: ByteArray
) : Serializable {
    @Lob
    private lateinit var thumbnail: ByteArray

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DigitalBook

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
