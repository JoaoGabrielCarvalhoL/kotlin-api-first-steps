package br.com.joaogabriel.book.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class ResourceNotFoundException(message:String) : RuntimeException(message) {

}