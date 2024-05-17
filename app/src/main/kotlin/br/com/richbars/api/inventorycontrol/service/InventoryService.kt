package br.com.richbars.api.inventorycontrol.service

import br.com.richbars.api.inventorycontrol.model.Product
import br.com.richbars.api.inventorycontrol.repository.ProductRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.ResponseStatus

@Service
class InventoryService(private val productRepository: ProductRepository) {

    fun findAllProducts(): List<Product> {
        return productRepository.findAll()
    }

    @ResponseStatus(HttpStatus.CREATED)
    fun addProduct(product: Product): Product {
        return productRepository.save(product)
    }
}
