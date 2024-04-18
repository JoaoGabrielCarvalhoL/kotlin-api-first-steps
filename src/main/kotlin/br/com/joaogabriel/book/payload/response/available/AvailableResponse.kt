package br.com.joaogabriel.book.payload.response.available

import br.com.joaogabriel.book.payload.response.book.BookResponse
import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import java.net.URI
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
data class AvailableResponse(
    val id: UUID,
    val name: String,
    val uri: URI,
    val book: BookResponse
) : Serializable
