package br.com.joaogabriel.book.mapper

import br.com.joaogabriel.book.entity.Book
import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.entity.builder.BookBuilder
import br.com.joaogabriel.book.payload.request.book.BookPostRequest
import br.com.joaogabriel.book.payload.request.book.BookPutRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPostRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPutRequest
import br.com.joaogabriel.book.payload.response.book.BookResponse
import br.com.joaogabriel.book.payload.response.customer.CustomerResponse

class BookMapper private constructor() {

    companion object {
        fun toBook(bookPostRequest: BookPostRequest): Book {
            return Book(
                bookPostRequest.title,
                bookPostRequest.description,
                bookPostRequest.bookCover,
                CategoryMapper.toCategory(bookPostRequest.category),
                AuthorMapper.toAuthor(bookPostRequest.author)
            )
        }

        fun toBook(bookPutRequest: BookPutRequest): Book? {
            return BookBuilder()
                .id(bookPutRequest.id)
                .title(bookPutRequest.title)
                .description(bookPutRequest.description)
                .bookCover(bookPutRequest.bookCover)
                .build()
        }

        fun toBookResponse(book: Book): BookResponse {
            return BookResponse(
                book.getId(), book.getTitle(), book.getDescription(), book.getBookCover(),
                CategoryMapper.toCategoryResponse(book.getCategory()),
                AuthorMapper.toAuthorResponse(book.getAuthor()),
                AvailableMapper.toAvailableResponseList(book.getAvailable())
            )
        }

        fun toBookResponseList(books: MutableList<Book>): MutableList<BookResponse> {
            return books.map { it ->
                BookResponse(
                    it.getId(),
                    it.getTitle(),
                    it.getDescription(),
                    it.getBookCover(),
                    CategoryMapper.toCategoryResponse(it.getCategory()),
                    AuthorMapper.toAuthorResponse(it.getAuthor()),
                    AvailableMapper.toAvailableResponseList(it.getAvailable())
                )
            }.toMutableList()
        }
    }
}
