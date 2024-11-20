import br.com.richbars.api.inventorycontrol.model.Product
import br.com.richbars.api.inventorycontrol.repository.ProductRepository
import br.com.richbars.api.inventorycontrol.service.InventoryService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class InventoryServiceTest {

    private lateinit var productRepository: ProductRepository
    private lateinit var inventoryService: InventoryService

    @BeforeEach
    fun setup() {
        productRepository = mock()
        inventoryService = InventoryService(productRepository)
    }

    @Test
    fun `should add a product`() {
        // Arrange
        val product = Product(name = "Test", description = "sabonete", price = 25.12F)
        `when`(productRepository.save(product)).thenReturn(product)

        // Act
        val result = inventoryService.addProduct(product)
        println(result)

        // Assert
        assertEquals(product, result)
        verify(productRepository).save(product)
    }
}
