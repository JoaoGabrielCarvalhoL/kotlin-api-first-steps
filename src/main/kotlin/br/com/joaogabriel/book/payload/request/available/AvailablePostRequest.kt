package br.com.joaogabriel.book.payload.request.available

import java.io.Serializable
import java.net.URI

data class AvailablePostRequest(
    val name: String,
    val uri: URI,
) : Serializable
