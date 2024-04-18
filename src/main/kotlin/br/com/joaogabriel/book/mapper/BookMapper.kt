package br.com.joaogabriel.book.mapper

import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.payload.request.CustomerPostRequest
import br.com.joaogabriel.book.payload.request.CustomerPutRequest
import br.com.joaogabriel.book.payload.response.CustomerResponse

class BookMapper private constructor(){

    companion object {
        fun toCustomer(customerPostRequest: CustomerPostRequest): Customer? {
            return null
        }

        fun toCustomer(customerPutRequest: CustomerPutRequest): Customer? {
            return null
        }

        fun toCustomerResponse(customer: Customer): CustomerResponse? {
            return null
        }
    }
}