package br.com.joaogabriel.book.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Level
import java.util.logging.Logger

@RestController
@RequestMapping("/api/v1/hello")
class HelloController {

    private val logger: Logger = Logger.getLogger(this::class.simpleName)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun hello(): ResponseEntity<String> {
        logger.log(Level.INFO, "Request accept!")
        return ResponseEntity.status(HttpStatus.OK).body("Hello from Kotlin")
    }
}