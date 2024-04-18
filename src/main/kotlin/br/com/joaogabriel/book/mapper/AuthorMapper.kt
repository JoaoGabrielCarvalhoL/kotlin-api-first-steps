package br.com.joaogabriel.book.mapper

import br.com.joaogabriel.book.entity.Author
import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.payload.request.author.AuthorPostRequest
import br.com.joaogabriel.book.payload.request.author.AuthorPutRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPutRequest
import br.com.joaogabriel.book.payload.response.author.AuthorResponse
import br.com.joaogabriel.book.payload.response.customer.CustomerResponse

class AuthorMapper private constructor() {

    companion object {
        fun toAuthor(authorPostRequest: AuthorPostRequest): Author {
            return Author(authorPostRequest.name)
        }

        fun toAuthor(authorPutRequest: AuthorPutRequest): Author {
            return Author(authorPutRequest.id, authorPutRequest.name)
        }

        fun toAuthorResponse(author: Author): AuthorResponse {
            return AuthorResponse(author.getId(), author.getName(),
                BookMapper.toBookResponseList(author.getBooks()))
        }
    }
}