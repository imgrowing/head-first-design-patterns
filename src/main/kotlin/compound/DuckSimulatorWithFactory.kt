package compound

import compound.decorator.QuackCounter
import compound.factory.AbstractDuckFactory
import compound.factory.CountingDuckFactory
import compound.factory.DuckFactory
import compound.goose.Goose
import compound.goose.GooseAdapter
import logging.logger

class DuckSimulatorWithFactory(
    private val factory: AbstractDuckFactory
) {
    fun simulate() {
        val mallardDuck: Quackable = factory.createMallardDuck()
        val redheadDuck: Quackable = factory.createMallardDuck()
        val duckCall: Quackable = factory.createDuckCall()
        val rubberDuck: Quackable = factory.createRubberDuck()

        logger.info { "오리 시뮬레이션 게임" }

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
    DuckSimulatorWithFactory(DuckFactory()).simulate()
    println()
    println()
    DuckSimulatorWithFactory(CountingDuckFactory()).simulate()
}