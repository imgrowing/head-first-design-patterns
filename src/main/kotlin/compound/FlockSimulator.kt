package compound

import compound.composite.Flock
import compound.decorator.QuackCounter
import compound.factory.AbstractDuckFactory
import compound.factory.CountingDuckFactory
import logging.logger

class FlockSimulator(
    private val factory: AbstractDuckFactory
) {
    fun simulate() {
        // 물오리 무리
        val flockOfMallards: Quackable = Flock(
            factory.createMallardDuck(),
            factory.createMallardDuck(),
            factory.createMallardDuck(),
            factory.createMallardDuck(),
        )

        // 전체 무리
        val flockOfDucks: Quackable = Flock(
            factory.createRedheadDuck(),
            factory.createDuckCall(),
            factory.createRubberDuck(),
            factory.createGooseDuck(),
            flockOfMallards,
        )

        logger.info { "오리가 시뮬레이션 게임: 전체 무리" }
        simulate(flockOfDucks)

        logger.info { "오리가 시뮬레이션 게임: 물오리 무리" }
        simulate(flockOfMallards)

        logger.info { "오리가 소리 낸 횟수: ${QuackCounter.numberOfQuacks}" }
    }

    private fun simulate(quackable: Quackable) {
        quackable.quack()
    }
}

fun main() {
    FlockSimulator(CountingDuckFactory()).simulate()
}