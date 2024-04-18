package br.com.joaogabriel.book.payload.response.category

import br.com.joaogabriel.book.payload.response.book.BookResponse
import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import java.util.UUID

@JsonInclude(JsonInclude.Include.NON_NULL)
data class CategoryResponse(
    val id: UUID,
    val name: String,
    val description: String,
    val books: MutableList<BookResponse>
) : Serializable
