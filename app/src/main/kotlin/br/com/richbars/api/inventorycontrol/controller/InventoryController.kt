package br.com.richbars.api.inventorycontrol.controller

import br.com.richbars.api.inventorycontrol.exception.ProductEmptyException
import br.com.richbars.api.inventorycontrol.model.Product
import br.com.richbars.api.inventorycontrol.service.InventoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/inventory-control")
class InventoryController(private val InventoryService: InventoryService){

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello"
    }
    @GetMapping("/products/all")
    fun findAllBooks(): List<Product> {
        val products = InventoryService.findAllProducts()

        return if (products.isEmpty()) {
            throw ProductEmptyException("List is empty")
        } else {
            products
        }

    }
}