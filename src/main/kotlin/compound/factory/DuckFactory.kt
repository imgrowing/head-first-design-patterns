package compound.factory

import compound.Quackable
import compound.duck.DuckCall
import compound.duck.MallardDuck
import compound.duck.RedheadDuck
import compound.duck.RubberDuck
import compound.goose.Goose
import compound.goose.GooseAdapter

class DuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable = MallardDuck()

    override fun createRedheadDuck(): Quackable = RedheadDuck()

    override fun createDuckCall(): Quackable = DuckCall()

    override fun createRubberDuck(): Quackable = RubberDuck()

    override fun createGooseDuck(): Quackable = GooseAdapter(Goose())
}