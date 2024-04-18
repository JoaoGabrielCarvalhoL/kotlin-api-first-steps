package br.com.joaogabriel.book.repository

import br.com.joaogabriel.book.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CustomerRepository : JpaRepository<Customer, UUID> {
}