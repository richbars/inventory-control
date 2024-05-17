package br.com.richbars.api.exception

import java.lang.RuntimeException

data class ProductException(
    val description: String,
): RuntimeException(description)