package br.com.joaogabriel.book.payload.request.customer

import br.com.joaogabriel.book.annotation.EmailAvailable
import br.com.joaogabriel.book.annotation.UsernameAvailable
import br.com.joaogabriel.book.entity.embeddable.Address
import br.com.joaogabriel.book.entity.embeddable.Contact
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import org.springframework.format.annotation.DateTimeFormat
import java.io.Serializable
import java.time.LocalDate

data class CustomerPostRequest(

    @NotBlank(message = "The field username, must be unique. The field cannot be update after register.")
    @UsernameAvailable
    val username: String,
    @NotBlank(message = "The field email, must be unique. The field cannot be update after register.")
    @Email
    @EmailAvailable
    val email: String,
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
