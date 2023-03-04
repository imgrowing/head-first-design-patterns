package compound

import compound.decorator.QuackCounter
import compound.duck.DuckCall
import compound.duck.MallardDuck
import compound.duck.RedheadDuck
import compound.duck.RubberDuck
import compound.goose.Goose
import compound.goose.GooseAdapter
import logging.logger

class QuackCounterSimulator {
    fun simulate() {
        val mallardDuck: Quackable = QuackCounter(MallardDuck())
        val redheadDuck: Quackable = QuackCounter(RedheadDuck())
        val duckCall: Quackable = QuackCounter(DuckCall())
        val rubberDuck: Quackable = QuackCounter(RubberDuck())

        logger.info { "오리가 소리낸 횟수 시뮬레이션 게임" }

        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)

        val gooseAdapter: Quackable = GooseAdapter(Goose())
        simulate(gooseAdapter)

        logger.info { "오리가 소리 낸 횟수: ${QuackCounter.numberOfQuacks}" }
    }

    private fun simulate(quackable: Quackable) {
        quackable.quack()
    }
}

fun main() {
    QuackCounterSimulator().simulate()
}