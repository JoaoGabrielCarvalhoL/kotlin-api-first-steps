package br.com.joaogabriel.book.service.impl

import br.com.joaogabriel.book.payload.response.customer.CustomerResponse
import br.com.joaogabriel.book.repository.CustomerRepository
import br.com.joaogabriel.book.service.CustomerService
import org.jboss.logging.Logger
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerServiceImpl(val customerRepository: CustomerRepository) : CustomerService {

    private val logger: Logger = Logger.getLogger(this::class.simpleName)

    override fun findAll(): MutableList<CustomerResponse> {
        TODO("Not yet implemented")
    }

    override fun findById(): CustomerResponse {
        TODO("Not yet implemented")
    }

    override fun delete(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun existsByEmail(email: String): Boolean {
        return !this.customerRepository.existsByEmail(email)
    }

    override fun existsByUsername(username: String): Boolean {
        return !this.customerRepository.existsByUsername(username)
    }
}