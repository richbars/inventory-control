package br.com.richbars.api.inventorycontrol.exception

import java.lang.RuntimeException

data class ProductException(
    val description: String,
): RuntimeException(description)

data class ProductEmptyException(
    val description: String,
): RuntimeException(description)