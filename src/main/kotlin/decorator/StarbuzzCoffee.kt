package decorator

import decorator.beverage.DarkRoast
import decorator.beverage.Espresso
import decorator.beverage.HouseBlend
import decorator.condiment.Mocha
import decorator.condiment.Soy
import decorator.condiment.Whip
import mu.KLogger
import mu.KotlinLogging

private val logger: KLogger = KotlinLogging.logger("StarbuzzCoffee")

fun main() {
    val beverage1: Beverage = Espresso()
    logger.info { "음료: ${beverage1.description} \$${beverage1.cost()}" }

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    logger.info { "음료: ${beverage2.description} \$${beverage2.cost()}" }

    val beverage3: Beverage = Whip(Mocha(Soy(HouseBlend())))
    logger.info { "음료: ${beverage3.description} \$${beverage3.cost()}" }

    val beverage4 = HouseBlend()
        .let { Soy(it) }
        .let { Mocha(it) }
        .let { Whip(it) }
    logger.info { "음료: ${beverage4.description} \$${beverage4.cost()}" }

}