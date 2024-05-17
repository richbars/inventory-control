package br.com.richbars.api.sabonete
import br.com.richbars.api.model.PRODUCTS
import br.com.richbars.api.repository.ProductRepo
import org.springframework.stereotype.Service

@Service
class SaboneteService(private val product: ProductRepo) {

    fun findAllProducts(): List<PRODUCTS> {
        return product.findAll()
    }
}