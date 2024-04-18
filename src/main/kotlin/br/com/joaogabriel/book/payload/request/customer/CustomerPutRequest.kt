package br.com.joaogabriel.book.payload.request.customer

import br.com.joaogabriel.book.entity.embeddable.Address
import br.com.joaogabriel.book.entity.embeddable.Contact
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import org.springframework.format.annotation.DateTimeFormat
import java.io.Serializable
import java.time.LocalDate
import java.util.*

data class CustomerPutRequest(
    @NotNull
    val id: UUID,
    @NotBlank
    val hashPassword: String,
    @NotBlank
    val name: String,
    @DateTimeFormat(style = "dd/MM/yyyy")
    val birthOfDate: LocalDate,
    @NotNull
    val contact: Contact,
    @NotNull
    val address: Address
) : Serializable
