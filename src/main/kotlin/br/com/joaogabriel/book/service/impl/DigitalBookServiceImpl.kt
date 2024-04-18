package br.com.joaogabriel.book.service.impl

import br.com.joaogabriel.book.repository.BookRepository
import br.com.joaogabriel.book.service.DigitalBookService
import org.springframework.stereotype.Service

@Service
class DigitalBookServiceImpl(private val digitalBookRepository: BookRepository) : DigitalBookService {
}