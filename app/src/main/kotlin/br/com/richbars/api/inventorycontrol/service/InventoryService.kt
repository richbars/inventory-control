package br.com.richbars.api.inventorycontrol.service

import br.com.richbars.api.inventorycontrol.model.Product
import br.com.richbars.api.inventorycontrol.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class InventoryService(private val productRepository: ProductRepository) {

    fun findAllProducts(): List<Product> {
        return productRepository.findAll()
    }
}
