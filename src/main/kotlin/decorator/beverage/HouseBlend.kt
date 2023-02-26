package decorator.beverage

import decorator.Beverage

class HouseBlend(
    description: String = "하우스 블렌드 커피"
) : Beverage(description) {
    override fun cost(): Double {
        return 0.89
    }
}