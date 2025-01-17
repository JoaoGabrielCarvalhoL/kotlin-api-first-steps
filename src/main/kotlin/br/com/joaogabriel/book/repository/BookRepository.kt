package br.com.joaogabriel.book.repository

import br.com.joaogabriel.book.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BookRepository : JpaRepository<Book, UUID> {
}