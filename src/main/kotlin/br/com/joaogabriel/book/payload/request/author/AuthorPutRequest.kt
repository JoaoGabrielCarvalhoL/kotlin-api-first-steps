package br.com.joaogabriel.book.payload.request.author

import java.io.Serializable
import java.util.UUID

data class AuthorPutRequest(
    val id: UUID,
    val name: String
) : Serializable
