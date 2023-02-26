package decorator.condiment

import decorator.Beverage
import decorator.CondimentDecorator

class Mocha(
    beverage: Beverage,
    override val description: String = "${beverage.description}, 모카",
) : CondimentDecorator(beverage) {
    override fun cost(): Double {
        return beverage.cost() + 0.20
    }
}