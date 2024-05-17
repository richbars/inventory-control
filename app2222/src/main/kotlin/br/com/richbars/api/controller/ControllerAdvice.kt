package br.com.richbars.api.controller

import br.com.richbars.api.exception.ProductException
import br.com.richbars.api.model.ErrorMessage
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(ProductException::class)
    fun handleDemoException(e: ProductException): ErrorMessage {
        return ErrorMessage(
            e.description ?: "An error ocurred",
            HttpStatus.BAD_REQUEST.value()
        )
    }
}