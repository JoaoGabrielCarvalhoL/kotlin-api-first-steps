package br.com.joaogabriel.book.service.impl

import br.com.joaogabriel.book.repository.CategoryRepository
import br.com.joaogabriel.book.service.CategoryService
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    private val logger: Logger = Logger.getLogger(this::class.simpleName)
}