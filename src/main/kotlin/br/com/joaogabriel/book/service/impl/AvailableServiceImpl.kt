package br.com.joaogabriel.book.service.impl

import br.com.joaogabriel.book.repository.AvailableRepository
import br.com.joaogabriel.book.service.AvailableService
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class AvailableServiceImpl(private val availableRepository: AvailableRepository) : AvailableService {
    private val logger: Logger = Logger.getLogger(this::class.simpleName)
}