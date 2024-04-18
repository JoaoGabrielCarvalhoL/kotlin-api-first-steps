package br.com.joaogabriel.book.mapper

import br.com.joaogabriel.book.entity.Available
import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.payload.request.available.AvailablePostRequest
import br.com.joaogabriel.book.payload.request.available.AvailablePutRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPostRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPutRequest
import br.com.joaogabriel.book.payload.response.available.AvailableResponse
import br.com.joaogabriel.book.payload.response.book.BookResponse
import br.com.joaogabriel.book.payload.response.customer.CustomerResponse

class AvailableMapper private constructor() {

    companion object {
        fun toAvailable(availablePostRequest: AvailablePostRequest): Available {
            return Available(availablePostRequest.name, availablePostRequest.uri)
        }

        fun toAvailable(availablePutRequest: AvailablePutRequest): Available {
            return Available(
                availablePutRequest.name, availablePutRequest.uri,
                availablePutRequest.id
            )
        }

        fun toAvailableResponse(available: Available): AvailableResponse {
            return AvailableResponse(
                available.getId(), available.getName(),
                available.getUri(), BookMapper.toBookResponse(available.getBook())
            )
        }

        fun toAvailableResponseList(available: MutableList<Available>): MutableList<AvailableResponse> {
            return available.map { it ->
                AvailableResponse(
                    it.getId(),
                    it.getName(),
                    it.getUri(),
                    BookMapper.toBookResponse(it.getBook()))
            }.toMutableList()
        }
    }
}