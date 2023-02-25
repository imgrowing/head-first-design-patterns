package strategy

import logging.logger

interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        logger.info { "꽥꽥" }
    }
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        logger.info { "<< 조용~ >>" }
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        logger.info { "삑삑" }
    }
}