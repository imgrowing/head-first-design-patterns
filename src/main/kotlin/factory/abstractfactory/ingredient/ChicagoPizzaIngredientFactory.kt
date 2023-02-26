package factory.abstractfactory.ingredient

import factory.abstractfactory.ingredient.cheese.Cheese
import factory.abstractfactory.ingredient.cheese.MozzarellaCheese
import factory.abstractfactory.ingredient.clams.Clams
import factory.abstractfactory.ingredient.clams.FrozenClams
import factory.abstractfactory.ingredient.dough.Dough
import factory.abstractfactory.ingredient.dough.ThickCrustDough
import factory.abstractfactory.ingredient.pepperoni.Pepperoni
import factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni
import factory.abstractfactory.ingredient.source.PlumTomatoSauce
import factory.abstractfactory.ingredient.source.Sauce
import factory.abstractfactory.ingredient.veggies.BlackOlives
import factory.abstractfactory.ingredient.veggies.EggPlant
import factory.abstractfactory.ingredient.veggies.Spinach
import factory.abstractfactory.ingredient.veggies.Veggies

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSource(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(
            BlackOlives(),
            Spinach(),
            EggPlant()
        )
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}