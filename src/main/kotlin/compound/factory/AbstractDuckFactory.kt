package compound.factory

import compound.Quackable

abstract class AbstractDuckFactory {
    abstract fun createMallardDuck(): Quackable
    abstract fun createRedheadDuck(): Quackable
    abstract fun createDuckCall(): Quackable
    abstract fun createRubberDuck(): Quackable
    abstract fun createGooseDuck(): Quackable
}