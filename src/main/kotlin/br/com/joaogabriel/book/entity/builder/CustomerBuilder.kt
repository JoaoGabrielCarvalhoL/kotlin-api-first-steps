package br.com.joaogabriel.book.entity.builder

import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.entity.embeddable.Address
import br.com.joaogabriel.book.entity.embeddable.Contact
import java.time.LocalDate
import java.util.UUID
import kotlin.reflect.full.createInstance


class CustomerBuilder {

    private val customer: Customer = Customer::class.createInstance()
    fun username(username: String) : CustomerBuilder {
        this.customer.setUsername(username)
        return this
    }

    fun id(id: UUID) : CustomerBuilder {
        this.customer.setId(id)
        return this
    }

    fun email(email: String) : CustomerBuilder {
        this.customer.setEmail(email)
        return this
    }

    fun hashPassword(hashPassword: String) : CustomerBuilder {
        this.customer.setHashPassword(hashPassword)
        return this
    }

    fun name(name: String) : CustomerBuilder{
        this.customer.setName(name)
        return this
    }

    fun birthOfDate(birthOfDate: LocalDate) : CustomerBuilder {
        this.customer.setBirthOfDate(birthOfDate)
        return this
    }

    fun address(address: Address) : CustomerBuilder {
        this.customer.setAddress(address)
        return this
    }

    fun contact(contact: Contact) : CustomerBuilder {
        this.customer.setContact(contact)
        return this
    }

    fun build() : Customer {
        return this.customer
    }
}