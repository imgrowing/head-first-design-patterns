package compound

import compound.duck.DuckCall
import compound.duck.MallardDuck
import compound.duck.RedheadDuck
import compound.duck.RubberDuck
import compound.goose.Goose
import compound.goose.GooseAdapter
import logging.logger

class DuckSimulator {
    fun simulate() {
        val mallardDuck: Quackable = MallardDuck()
        val redheadDuck: Quackable = RedheadDuck()
        val duckCall: Quackable = DuckCall()
        val rubberDuck: Quackable = RubberDuck()

        logger.info { "오리 시뮬레이션 게임" }

        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)

        val gooseAdapter: Quackable = GooseAdapter(Goose())
        simulate(gooseAdapter)
    }

    private fun simulate(quackable: Quackable) {
        quackable.quack()
    }
}

fun main() {
    DuckSimulator().simulate()
}