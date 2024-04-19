package br.com.joaogabriel.book.annotation

import br.com.joaogabriel.book.validator.EmailAvailableValidator
import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [EmailAvailableValidator::class])
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class EmailAvailable(
    val message: String = "Email already in use.",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)