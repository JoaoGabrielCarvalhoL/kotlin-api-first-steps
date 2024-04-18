package br.com.joaogabriel.book.payload.request.book

import br.com.joaogabriel.book.payload.request.author.AuthorPostRequest
import br.com.joaogabriel.book.payload.request.category.CategoryPostRequest
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import java.io.Serializable
import java.util.*

data class BookPutRequest(
    @NotNull
    val id: UUID,
    @NotBlank
    val title: String,
    @NotBlank
    val description: String,
    var bookCover: ByteArray

) : Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BookPutRequest

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
