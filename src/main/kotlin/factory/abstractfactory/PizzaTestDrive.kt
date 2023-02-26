package factory.abstractfactory

import factory.abstractfactory.store.ChicagoPizzaStore
import factory.abstractfactory.store.NYPizzaStore
import factory.abstractfactory.store.PizzaStore
import mu.KotlinLogging

private val logger = KotlinLogging.logger("PizzaTestDrive")

fun main() {
    val nyPizzaStore: PizzaStore = NYPizzaStore()
    val pizza1 = nyPizzaStore.orderPizza("cheese")
    logger.info { "에단이 주문한 ${pizza1.name}" }

    val chicagoPizzaStore: PizzaStore = ChicagoPizzaStore()
    val pizza2 = chicagoPizzaStore.orderPizza("cheese")
    logger.info { "조엘이 주문한 ${pizza2.name}" }
}