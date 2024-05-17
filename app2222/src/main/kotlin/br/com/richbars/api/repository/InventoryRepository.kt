package br.com.richbars.api.repository
import br.com.richbars.api.model.PRODUCTS
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepo : JpaRepository<PRODUCTS, Long>
