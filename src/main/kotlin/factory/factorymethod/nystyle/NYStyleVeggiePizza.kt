package factory.factorymethod.nystyle

import factory.factorymethod.Pizza

class NYStyleVeggiePizza(
    name: String = "",
    dough: String = "",
    sauce: String = "",
    toppings: List<String> = listOf("")
) : Pizza(name = name, dough = dough, sauce = sauce, toppings = toppings)
