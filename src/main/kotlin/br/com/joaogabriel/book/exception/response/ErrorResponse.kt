package br.com.joaogabriel.book.exception.response

import org.springframework.http.HttpStatus
import java.io.Serializable
import java.time.LocalDateTime

data class ErrorResponse(
    private val httpStatusCode: Int,
    private val httpStatusTitle: String,
    private val occurredIn: LocalDateTime,
    private val message: String
) : Serializable
