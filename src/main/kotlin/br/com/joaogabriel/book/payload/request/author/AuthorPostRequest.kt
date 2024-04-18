package br.com.joaogabriel.book.payload.request.author

import java.io.Serializable

data class AuthorPostRequest(
    val name: String
) : Serializable
