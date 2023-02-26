package factory.abstractfactory.store

import factory.abstractfactory.ingredient.NYPizzaIngredientFactory
import factory.abstractfactory.ingredient.PizzaIngredientFactory
import factory.abstractfactory.pizza.*

class NYPizzaStore : PizzaStore() {
    private val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza("뉴욕 스타일 치즈 피자", ingredientFactory)
            "pepperoni" -> PepperoniPizza("뉴욕 스타일 페퍼로니 피자", ingredientFactory)
            "clam" -> ClamPizza("뉴욕 스타일 조개 피자", ingredientFactory)
            "veggie" -> VeggiePizza("뉴욕 스타일 야채 피자", ingredientFactory)
            else -> throw IllegalArgumentException()
        }
    }
}