package factory.abstractfactory.pizza

import factory.abstractfactory.ingredient.cheese.Cheese
import factory.abstractfactory.ingredient.clams.Clams
import factory.abstractfactory.ingredient.dough.Dough
import factory.abstractfactory.ingredient.pepperoni.Pepperoni
import factory.abstractfactory.ingredient.source.Sauce
import factory.abstractfactory.ingredient.veggies.Veggies
import logging.logger

abstract class Pizza(val name: String) {
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: List<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null


    abstract fun prepare()

    open fun bake() {
        logger.info { "175도에서 25분 간 굽기" }
    }

    open fun cut() {
        logger.info { "피자를 사선으로 자르기" }
    }

    open fun box() {
        logger.info { "상자에 피자 담기" }
    }

    override fun toString(): String {
        return "Pizza(name='$name', dough=$dough, sauce=$sauce, veggies=$veggies, cheese=$cheese, pepperoni=$pepperoni, clam=$clam)"
    }

}