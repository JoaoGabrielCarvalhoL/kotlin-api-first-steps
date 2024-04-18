package br.com.joaogabriel.book.repository

import br.com.joaogabriel.book.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CategoryRepository : JpaRepository<Category, UUID> {
}