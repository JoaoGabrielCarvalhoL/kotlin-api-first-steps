package br.com.joaogabriel.book.handler

import br.com.joaogabriel.book.exception.ResourceAlreadyInUseException
import br.com.joaogabriel.book.exception.ResourceNotFoundException
import br.com.joaogabriel.book.exception.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.lang.Exception
import java.time.LocalDateTime

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException::class)
    fun handleResourceNotFoundException(exception: ResourceNotFoundException) : ResponseEntity<ErrorResponse> {
        val errorResponse: ErrorResponse =
            ErrorResponse(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.name,
                LocalDateTime.now(), exception.message.toString())
        return ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(ResourceAlreadyInUseException::class)
    fun handleResourceAlreadyInUseException(exception: ResourceAlreadyInUseException) : ResponseEntity<ErrorResponse> {
        val errorResponse: ErrorResponse =
            ErrorResponse(HttpStatus.CONFLICT.value(), HttpStatus.CONFLICT.name,
                LocalDateTime.now(), exception.message.toString())
        return ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.CONFLICT)
    }

    @ExceptionHandler(Exception::class)
    fun handleException(exception: Exception) : ResponseEntity<ErrorResponse> {
        val errorResponse: ErrorResponse =
            ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.name,
                LocalDateTime.now(), exception.message.toString())
        return ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR)
    }
}