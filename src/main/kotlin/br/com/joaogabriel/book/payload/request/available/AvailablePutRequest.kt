package br.com.joaogabriel.book.payload.request.available

import java.io.Serializable
import java.net.URI
import java.util.*

data class  AvailablePutRequest(
    val id: UUID,
    val name: String,
    val uri: URI,
) : Serializable
