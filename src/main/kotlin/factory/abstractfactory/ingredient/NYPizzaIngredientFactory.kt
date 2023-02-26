package factory.abstractfactory.ingredient

import factory.abstractfactory.ingredient.cheese.Cheese
import factory.abstractfactory.ingredient.cheese.ReggianoCheese
import factory.abstractfactory.ingredient.clams.Clams
import factory.abstractfactory.ingredient.clams.FreshClams
import factory.abstractfactory.ingredient.dough.Dough
import factory.abstractfactory.ingredient.dough.ThinCrustDough
import factory.abstractfactory.ingredient.pepperoni.Pepperoni
import factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni
import factory.abstractfactory.ingredient.source.MarinaraSauce
import factory.abstractfactory.ingredient.source.Sauce
import factory.abstractfactory.ingredient.veggies.*

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSource(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(
            Garlic(),
            Onion(),
            Mushroom(),
            RedPepper()
        )
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}