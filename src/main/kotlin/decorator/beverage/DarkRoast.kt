package decorator.beverage

import decorator.Beverage

class DarkRoast(
    description: String = "다크 로스트"
) : Beverage(description) {
    override fun cost(): Double {
        return 0.99
    }
}