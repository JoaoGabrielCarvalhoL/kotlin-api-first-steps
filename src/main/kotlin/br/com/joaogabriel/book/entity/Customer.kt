package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.format.annotation.DateTimeFormat
import java.io.Serializable
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "tb_customer")
data class Customer(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID,
    @Column(nullable = false, unique = true, updatable = false)
    private val username: String,
    @Column(nullable = false, unique = true)
    private val email: String,
    @Column(nullable = false)
    private val hashPassword: String,
    @Column(nullable = false)
    private val name: String,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private val birthOfDate: LocalDate,
    private val isActive: Boolean,
    @Embedded
    private val contact: Contact,
    @Embedded
    private val address: Address,
    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private val createdIn: LocalDateTime
) : Serializable {

}
