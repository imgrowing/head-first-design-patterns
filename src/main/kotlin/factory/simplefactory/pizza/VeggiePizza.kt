package factory.simplefactory.pizza

import factory.simplefactory.Pizza

class VeggiePizza(
    name: String = "Veggie Pizza",
    dough: String = "Crust",
    sauce: String = "Marinara Sauce",
    toppings: List<String> = listOf(
        "Shredded mozzarella",
        "Grated parmesan",
        "Diced onion",
        "Sliced mushrooms",
        "Sliced red pepper",
        "Sliced black olives",
    )
) : Pizza(name, dough, sauce, toppings)

