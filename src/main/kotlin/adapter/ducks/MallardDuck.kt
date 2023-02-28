package adapter.ducks

import logging.logger

class MallardDuck : Duck {
    override fun quack() {
        logger.info { "꽥" }
    }

    override fun fly() {
        logger.info { "날고 있어요!!" }
    }
}