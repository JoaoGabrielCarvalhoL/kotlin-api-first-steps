package br.com.joaogabriel.book.entity.embeddable

import jakarta.persistence.Embeddable

@Embeddable
data class Contact(
    private val cellphone: String,
    private var telephone: String?
)
