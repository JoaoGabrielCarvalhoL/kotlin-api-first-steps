package br.com.joaogabriel.book.entity

import jakarta.persistence.Embeddable

@Embeddable
data class Contact(
    private val cellphone: String,
    private var telephone: String?
)
