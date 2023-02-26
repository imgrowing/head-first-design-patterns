package factory.factorymethod.chicagostyle

import factory.factorymethod.Pizza

class ChicagoStyleClamPizza(
    name: String = "",
    dough: String = "",
    sauce: String = "",
    toppings: List<String> = listOf("")
) : Pizza(name = name, dough = dough, sauce = sauce, toppings = toppings)
