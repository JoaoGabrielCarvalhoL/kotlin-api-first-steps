package br.com.joaogabriel.book.service.impl

import br.com.joaogabriel.book.repository.BookRepository
import br.com.joaogabriel.book.service.BookService
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class BookServiceImpl(private val bookRepository: BookRepository) : BookService {
    private val logger: Logger = Logger.getLogger(this::class.simpleName)
}