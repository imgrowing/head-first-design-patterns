package factory.factorymethod.chicagostyle

import factory.factorymethod.Pizza
import factory.factorymethod.PizzaStore

class ChicagoStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()
            "clam" -> ChicagoStyleClamPizza()
            "veggie" -> ChicagoStyleVeggiePizza()
            else -> throw IllegalArgumentException()
        }
    }
}