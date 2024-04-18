package br.com.joaogabriel.book.payload.response.book

import br.com.joaogabriel.book.entity.Author
import br.com.joaogabriel.book.entity.Available
import br.com.joaogabriel.book.entity.Category
import br.com.joaogabriel.book.payload.response.author.AuthorResponse
import br.com.joaogabriel.book.payload.response.available.AvailableResponse
import br.com.joaogabriel.book.payload.response.category.CategoryResponse
import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
data class BookResponse(
    val id: UUID,
    val title: String,
    val description: String,
    var bookCover: ByteArray?,
    val category: CategoryResponse,
    val author: AuthorResponse,
    val available: MutableList<AvailableResponse>
) : Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BookResponse

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
