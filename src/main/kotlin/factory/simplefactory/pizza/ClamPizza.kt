package factory.simplefactory.pizza

import factory.simplefactory.Pizza

class ClamPizza(
    name: String = "Clam Pizza",
    dough: String = "Thin Crust",
    sauce: String = "White garlic sauce",
    toppings: List<String> = listOf("Clams", "Grated parmesan cheese")
) : Pizza(name, dough, sauce, toppings)

