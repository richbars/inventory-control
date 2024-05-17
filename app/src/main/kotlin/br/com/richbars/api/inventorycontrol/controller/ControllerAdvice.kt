package br.com.richbars.api.inventorycontrol.controller

import br.com.richbars.api.inventorycontrol.exception.ProductEmptyException
import br.com.richbars.api.inventorycontrol.exception.ProductException
import br.com.richbars.api.inventorycontrol.model.ErrorMessage
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(ProductException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleProductException(e: ProductException): ErrorMessage {
        return ErrorMessage(
            e.description ?: "An error ocurred",
            HttpStatus.BAD_REQUEST.value()
        )
    }

    @ExceptionHandler(ProductEmptyException::class)
    @ResponseStatus(HttpStatus.OK)
    fun handleProductEmptyException(e: ProductEmptyException): ErrorMessage {
        return ErrorMessage(
            e.description ?: "List is empty",
            HttpStatus.OK.value()
        )
    }
}