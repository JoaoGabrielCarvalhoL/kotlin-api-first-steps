package br.com.joaogabriel.book.controller

import br.com.joaogabriel.book.service.CustomerService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(val customerService: CustomerService) {
}