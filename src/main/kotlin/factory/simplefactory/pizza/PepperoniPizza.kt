package factory.simplefactory.pizza

import factory.simplefactory.Pizza

class PepperoniPizza(
    name: String = "Pepperoni Pizza",
    dough: String = "Crust",
    sauce: String = "Marinara Sauce",
    toppings: List<String> = listOf("Sliced Pepperoni", "Sliced Onion", "Grated parmesan cheese")
) : Pizza(name, dough, sauce, toppings)

