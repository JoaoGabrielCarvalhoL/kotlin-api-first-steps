package br.com.joaogabriel.book.validator

import br.com.joaogabriel.book.annotation.EmailAvailable
import br.com.joaogabriel.book.annotation.UsernameAvailable
import br.com.joaogabriel.book.service.CustomerService
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class UsernameAvailableValidator(private val customerService: CustomerService) : ConstraintValidator<UsernameAvailable, String> {

    override fun isValid(value: String?, p1: ConstraintValidatorContext?): Boolean {
        if (value.isNullOrEmpty()) {
            return false
        }
        return customerService.existsByUsername(value)
    }
}