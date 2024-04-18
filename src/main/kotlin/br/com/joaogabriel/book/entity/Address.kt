package br.com.joaogabriel.book.entity

import jakarta.persistence.Embeddable

@Embeddable
data class Address(
    private val zipCode: String,
    private val publicPlace: String,
    private val complement: String,
    private val neighborhood: String,
    private val locality: String,
    private val federateUnit: String
)
