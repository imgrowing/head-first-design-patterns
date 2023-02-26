package decorator

abstract class CondimentDecorator(
    val beverage: Beverage,
) : Beverage() {
    abstract override val description: String
}