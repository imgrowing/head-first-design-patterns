package strategy

import strategy.duck.MallardDuck
import strategy.duck.ModelDuck

fun main() {
    val duck: Duck = MallardDuck()
    duck.display()
    duck.swim()
    duck.performFly()
    duck.performQuack()

    val model: Duck = ModelDuck()
    model.display()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}