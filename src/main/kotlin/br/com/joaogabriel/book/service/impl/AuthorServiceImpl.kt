package br.com.joaogabriel.book.service.impl

import br.com.joaogabriel.book.repository.AuthorRepository
import br.com.joaogabriel.book.service.AuthorService
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository) : AuthorService {
    private val logger: Logger = Logger.getLogger(this::class.simpleName)
}