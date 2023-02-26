package factory.simplefactory

import mu.KotlinLogging

private val logger = KotlinLogging.logger("PizzaTestDrive")

fun main() {
    val factory = SimplePizzaFactory()
    val store = PizzaStore(factory)

    var pizza = store.orderPizza("cheese")
    logger.info {"We ordered a ${pizza.name}" }
    logger.info { pizza }

    pizza = store.orderPizza("veggie")
    logger.info { "We ordered a ${pizza.name}" }
    logger.info { pizza }
}