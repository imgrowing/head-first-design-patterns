package factory.simplefactory

class PizzaStore(var factory: SimplePizzaFactory) {
    fun orderPizza(type: String): Pizza {
        val pizza: Pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}