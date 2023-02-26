package factory.abstractfactory.store

import factory.abstractfactory.ingredient.ChicagoPizzaIngredientFactory
import factory.abstractfactory.ingredient.PizzaIngredientFactory
import factory.abstractfactory.pizza.*

class ChicagoPizzaStore : PizzaStore() {

    private val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza("시카고 스타일 치즈 피자", ingredientFactory)
            "pepperoni" -> PepperoniPizza("시카고 스타일 페퍼로니 피자", ingredientFactory)
            "clam" -> ClamPizza("시카고 스타일 조개 피자", ingredientFactory)
            "veggie" -> VeggiePizza("시카고 스타일 야채 피자", ingredientFactory)
            else -> throw IllegalArgumentException()
        }
    }

}