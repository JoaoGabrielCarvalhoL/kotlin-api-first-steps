package br.com.joaogabriel.book.mapper

import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.entity.builder.CustomerBuilder
import br.com.joaogabriel.book.payload.request.customer.CustomerPostRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPutRequest
import br.com.joaogabriel.book.payload.response.customer.CustomerResponse

class CustomerMapper private constructor() {

    companion object {
        fun toCustomer(customerPostRequest: CustomerPostRequest): Customer? {
            return Customer(
                customerPostRequest.username,
                customerPostRequest.email,
                customerPostRequest.hashPassword,
                customerPostRequest.name,
                customerPostRequest.birthOfDate,
                customerPostRequest.contact,
                customerPostRequest.address
            )
        }

        fun toCustomer(customerPutRequest: CustomerPutRequest): Customer {

            return CustomerBuilder().hashPassword(customerPutRequest.hashPassword)
                .name(customerPutRequest.name).birthOfDate(customerPutRequest.birthOfDate)
                .contact(customerPutRequest.contact).address(customerPutRequest.address)
                .id(customerPutRequest.id).build()
        }

        fun toCustomerResponse(customer: Customer): CustomerResponse {
            return CustomerResponse(
                customer.getId(),
                customer.getName(),
                customer.getUsername(),
                customer.getEmail(),
                customer.getContact(),
                customer.getAddress(),
                customer.getCreatedIn()
            )
        }
    }
}