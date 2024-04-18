package br.com.joaogabriel.book.payload.request.book

import br.com.joaogabriel.book.payload.request.author.AuthorPostRequest
import br.com.joaogabriel.book.payload.request.category.CategoryPostRequest
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import java.io.Serializable

data class BookPostRequest(
    @NotBlank
    val title: String,
    @NotBlank
    val description: String,

    var bookCover: ByteArray,
    @NotNull
    var category: CategoryPostRequest,
    @NotNull
    var author: AuthorPostRequest
) : Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BookPostRequest

        return title == other.title
    }

    override fun hashCode(): Int {
        return title.hashCode()
    }
}
