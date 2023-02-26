package decorator.condiment

import decorator.Beverage
import decorator.CondimentDecorator

class Soy(
    beverage: Beverage,
    override val description: String = "${beverage.description}, 두유",
) : CondimentDecorator(beverage) {
    override fun cost(): Double {
        return beverage.cost() + 0.15
    }
}