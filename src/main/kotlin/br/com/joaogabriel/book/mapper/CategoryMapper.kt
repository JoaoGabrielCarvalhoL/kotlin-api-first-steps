package br.com.joaogabriel.book.mapper

import br.com.joaogabriel.book.entity.Category
import br.com.joaogabriel.book.entity.Customer
import br.com.joaogabriel.book.payload.request.category.CategoryPostRequest
import br.com.joaogabriel.book.payload.request.category.CategoryPutRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPostRequest
import br.com.joaogabriel.book.payload.request.customer.CustomerPutRequest
import br.com.joaogabriel.book.payload.response.category.CategoryResponse
import br.com.joaogabriel.book.payload.response.customer.CustomerResponse

class CategoryMapper private constructor() {

    companion object {
        fun toCategory(categoryPostRequest: CategoryPostRequest): Category {
            return Category(categoryPostRequest.name, categoryPostRequest.description)
        }

        fun toCategory(categoryPutRequest: CategoryPutRequest): Category {
            return Category(categoryPutRequest.name, categoryPutRequest.description, categoryPutRequest.id)
        }

        fun toCategoryResponse(category: Category): CategoryResponse {
            return CategoryResponse(
                category.getId(),
                category.getName(),
                category.getDescription(),
                BookMapper.toBookResponseList(category.getBooks())
            )
        }
    }
}