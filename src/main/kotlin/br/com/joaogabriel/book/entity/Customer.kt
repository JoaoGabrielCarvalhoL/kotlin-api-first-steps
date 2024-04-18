package br.com.joaogabriel.book.entity

import br.com.joaogabriel.book.entity.embeddable.Address
import br.com.joaogabriel.book.entity.embeddable.Contact
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

    @Column(nullable = false, unique = true, updatable = false)
    private var username: String,
    @Column(nullable = false, unique = true)
    private var email: String,
    @Column(nullable = false)
    private var hashPassword: String,
    @Column(nullable = false)
    private var name: String,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private var birthOfDate: LocalDate,
    @Embedded
    private var contact: Contact,
    @Embedded
    private var address: Address,

    ) : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private lateinit var id: UUID
    private var isActive: Boolean = true

    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private lateinit var createdIn: LocalDateTime

    constructor(
        username: String, email: String, hashPassword: String, name: String,
        birthOfDate: LocalDate, contact: Contact, address: Address, id:UUID
    ) : this(username, email, hashPassword, name, birthOfDate, contact, address) {
        this.id = id;
    }

    fun getId(): UUID {
        return id
    }

    fun setId(id: UUID): Unit {
        this.id = id
    }

    fun getUsername(): String {
        return username
    }

    fun setUsername(username: String) : Unit {
        this.username = username
    }

    fun getEmail(): String {
        return email;
    }

    fun setEmail(email: String): Unit {
        this.email = email
    }

    fun getHashPassword(): String {
        return hashPassword
    }

    fun setHashPassword(hashPassword: String): Unit {
        this.hashPassword = hashPassword;
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) : Unit {
        this.name = name
    }

    fun getBirthOfDate(): LocalDate {
        return birthOfDate
    }

    fun setBirthOfDate(birthOfDate: LocalDate) : Unit {
        this.birthOfDate = birthOfDate
    }

    fun getAddress(): Address {
        return address
    }

    fun setAddress(address: Address) : Unit {
        this.address = address
    }

    fun getContact(): Contact {
        return contact
    }

    fun setContact(contact: Contact) : Unit {
        this.contact = contact
    }

    fun getCreatedIn(): LocalDateTime {
        return createdIn
    }
}
