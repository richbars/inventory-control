package br.com.richbars.api.repository
import br.com.richbars.api.model.ProductModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<ProductModel, Long>
