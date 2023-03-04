package compound.duck

import compound.Quackable
import logging.logger

class MallardDuck : Quackable {
    override fun quack() {
        logger.info { "꽤꽥" }
    }
}