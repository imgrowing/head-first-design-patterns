package factory.abstractfactory.ingredient

import factory.abstractfactory.ingredient.cheese.Cheese
import factory.abstractfactory.ingredient.clams.Clams
import factory.abstractfactory.ingredient.dough.Dough
import factory.abstractfactory.ingredient.pepperoni.Pepperoni
import factory.abstractfactory.ingredient.source.Sauce
import factory.abstractfactory.ingredient.veggies.Veggies

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSource(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}