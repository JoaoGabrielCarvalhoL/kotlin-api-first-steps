package br.com.joaogabriel.book.repository

import br.com.joaogabriel.book.entity.Author
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AuthorRepository : JpaRepository<Author, UUID> {
}