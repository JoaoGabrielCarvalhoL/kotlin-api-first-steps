package br.com.joaogabriel.book.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.CONFLICT)
class ResourceAlreadyInUseException(message: String) : RuntimeException(message) {
}