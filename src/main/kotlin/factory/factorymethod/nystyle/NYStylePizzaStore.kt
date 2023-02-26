package factory.factorymethod.nystyle

import factory.factorymethod.Pizza
import factory.factorymethod.PizzaStore

class NYStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> NYStyleCheesePizza()
            "pepperoni" -> NYStylePepperoniPizza()
            "clam" -> NYStyleClamPizza()
            "veggie" -> NYStyleVeggiePizza()
            else -> throw IllegalArgumentException()
        }
    }
}