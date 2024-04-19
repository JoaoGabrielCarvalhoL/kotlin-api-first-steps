package br.com.joaogabriel.book.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenAPIConfig {

    @Bean
    fun configOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                .title("Book.")
                .version("1.0 - Development.")
                .description("Book System.")
                .contact(
                    Contact()
                    .name("João Gabriel Carvalho")
                    .email("27.joaogabriel@gmail.com")
                    .url("http://github.com/JoaoGabrielCarvalhoL"))
                .license(
                    License()
                    .name("Apache 2.0")
                    .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}