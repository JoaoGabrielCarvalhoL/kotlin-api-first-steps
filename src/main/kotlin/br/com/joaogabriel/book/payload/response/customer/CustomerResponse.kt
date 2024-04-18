package br.com.joaogabriel.book.payload.response.customer

import br.com.joaogabriel.book.entity.embeddable.Address
import br.com.joaogabriel.book.entity.embeddable.Contact
import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import java.time.LocalDateTime
import java.util.UUID

@JsonInclude(JsonInclude.Include.NON_NULL)
data class CustomerResponse(
    val id: UUID,
    val name: String,
    val username: String,
    val email: String,
    val contact: Contact,
    val address: Address,
    val createdIn: LocalDateTime
) : Serializable
