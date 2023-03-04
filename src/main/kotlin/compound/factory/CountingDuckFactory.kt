package compound.factory

import compound.Quackable
import compound.decorator.QuackCounter
import compound.duck.DuckCall
import compound.duck.MallardDuck
import compound.duck.RedheadDuck
import compound.duck.RubberDuck
import compound.goose.Goose
import compound.goose.GooseAdapter

class CountingDuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable = QuackCounter(MallardDuck())

    override fun createRedheadDuck(): Quackable = QuackCounter(RedheadDuck())

    override fun createDuckCall(): Quackable = QuackCounter(DuckCall())

    override fun createRubberDuck(): Quackable = QuackCounter(RubberDuck())

    override fun createGooseDuck(): Quackable = GooseAdapter(Goose())
}