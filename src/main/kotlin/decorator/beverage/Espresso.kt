package decorator.beverage

import decorator.Beverage

class Espresso(
    description: String = "에스프레소"
) : Beverage(description) {
    override fun cost(): Double {
        return 1.99
    }
}