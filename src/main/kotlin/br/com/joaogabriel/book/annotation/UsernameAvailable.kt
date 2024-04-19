package br.com.joaogabriel.book.annotation

import br.com.joaogabriel.book.validator.EmailAvailableValidator
import br.com.joaogabriel.book.validator.UsernameAvailableValidator
import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [UsernameAvailableValidator::class])
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class UsernameAvailable(
    val message: String = "Username already in use.",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)