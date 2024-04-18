package br.com.joaogabriel.book.repository

import br.com.joaogabriel.book.entity.Available
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AvailableRepository : JpaRepository<Available, UUID> {
}