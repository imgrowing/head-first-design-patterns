package factory.simplefactory

import factory.simplefactory.pizza.CheesePizza
import factory.simplefactory.pizza.ClamPizza
import factory.simplefactory.pizza.PepperoniPizza
import factory.simplefactory.pizza.VeggiePizza

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            "clam" -> ClamPizza()
            "veggie" -> VeggiePizza()
            else -> throw IllegalArgumentException()
        }
    }
}