package compound.duck

import compound.Quackable
import logging.logger

class RedheadDuck : Quackable {
    override fun quack() {
        logger.info { "꽥꽥" }
    }
}