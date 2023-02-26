package factory.simplefactory.pizza

import factory.simplefactory.Pizza

class CheesePizza(
    name: String = "Cheese Pizza",
    dough: String = "Regular Crust",
    sauce: String = "Marinara Pizza Sauce",
    toppings: List<String> = listOf("Fresh Mozzarella", "Parmesan")
) : Pizza(name, dough, sauce, toppings)
