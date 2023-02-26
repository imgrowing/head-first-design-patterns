package factory.abstractfactory.pizza

import factory.abstractfactory.ingredient.PizzaIngredientFactory
import logging.logger

class PepperoniPizza(
    name: String,
    private val ingredientFactory: PizzaIngredientFactory
) : Pizza(name) {
    override fun prepare() {
        logger.info { "준비 중: $name" }
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSource()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
        pepperoni = ingredientFactory.createPepperoni()
    }
}