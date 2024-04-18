package br.com.joaogabriel.book.payload.request.category

import java.io.Serializable

data class CategoryPostRequest(
    val name: String,
    val description: String
) : Serializable
