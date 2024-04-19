package br.com.joaogabriel.book.validator

import br.com.joaogabriel.book.annotation.EmailAvailable
import br.com.joaogabriel.book.service.CustomerService
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class EmailAvailableValidator(private val customerService: CustomerService) : ConstraintValidator<EmailAvailable, String> {

    override fun isValid(value: String?, p1: ConstraintValidatorContext?): Boolean {
        if (value.isNullOrEmpty()) {
            return false
        }
        return customerService.existsByEmail(value)
    }
}