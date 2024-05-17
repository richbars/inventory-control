package br.com.richbars.api.inventorycontrol

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = ["br.com.richbars.api"])
@EnableJpaRepositories(basePackages = ["br.com.richbars.api.repository"])
class InventorycontrolApplication

fun main(args: Array<String>) {
	runApplication<InventorycontrolApplication>(*args)
}
