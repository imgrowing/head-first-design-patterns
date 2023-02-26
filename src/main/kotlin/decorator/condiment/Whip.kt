package decorator.condiment

import decorator.Beverage
import decorator.CondimentDecorator

class Whip(
    beverage: Beverage,
    override val description: String = "${beverage.description}, 휘핑크림",
) : CondimentDecorator(beverage) {
    override fun cost(): Double {
        return beverage.cost() + 0.10
    }
}