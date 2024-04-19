package br.com.joaogabriel.book.service

import br.com.joaogabriel.book.payload.response.customer.CustomerResponse
import java.util.UUID

interface CustomerService {

    fun findAll(): MutableList<CustomerResponse>

    fun findById(): CustomerResponse

    fun delete(id: UUID): Unit

    fun existsByEmail(email: String) : Boolean

    fun existsByUsername(username: String) : Boolean
}