package br.com.joaogabriel.book.payload.request.category

import java.io.Serializable
import java.util.UUID

data class CategoryPutRequest(
    val id: UUID,
    val name: String,
    val description: String
) : Serializable
