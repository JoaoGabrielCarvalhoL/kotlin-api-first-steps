package br.com.joaogabriel.book.payload.response.author

import br.com.joaogabriel.book.payload.response.book.BookResponse
import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
data class AuthorResponse(
    val id: UUID,
    val name: String,
    val books: MutableList<BookResponse>
) : Serializable {
}