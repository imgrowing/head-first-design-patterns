package factory.factorymethod

import factory.factorymethod.chicagostyle.ChicagoStylePizzaStore
import factory.factorymethod.nystyle.NYStylePizzaStore
import mu.KotlinLogging

private val logger = KotlinLogging.logger("PizzaTestDrive")

fun main() {
    val nyPizzaStore: PizzaStore = NYStylePizzaStore()
    val pizza1 = nyPizzaStore.orderPizza("cheese")
    logger.info { "에단이 주문한 ${pizza1.name}" }

    val chicagoStylePizzaStore: PizzaStore = ChicagoStylePizzaStore()
    val pizza2 = chicagoStylePizzaStore.orderPizza("cheese")
    logger.info { "조엘이 주문한 ${pizza2.name}" }
}