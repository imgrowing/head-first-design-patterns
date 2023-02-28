package templatemethod.barista

fun main() {
    val coffee: CaffeineBeverage = Coffee()
    coffee.prepareRecipe()

    val coffeeWithoutCondiment: CaffeineBeverage = CoffeeWithHook()
    coffeeWithoutCondiment.prepareRecipe()

    val tea: CaffeineBeverage = Tea()
    tea.prepareRecipe()
}