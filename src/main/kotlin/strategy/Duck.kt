package strategy

import logging.logger

abstract class Duck(
    var quackBehavior: QuackBehavior,
    var flyBehavior: FlyBehavior,
) {
    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun swim() {
        logger.info { "모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠." }
    }
}