package decorator.beverage

import decorator.Beverage

class Decaf(
    description: String = "๋์นดํ์ธ"
) : Beverage(description) {
    override fun cost(): Double {
        return 1.05
    }
}