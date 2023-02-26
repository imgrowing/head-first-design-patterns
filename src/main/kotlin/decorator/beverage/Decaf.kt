package decorator.beverage

import decorator.Beverage

class Decaf(
    description: String = "디카페인"
) : Beverage(description) {
    override fun cost(): Double {
        return 1.05
    }
}