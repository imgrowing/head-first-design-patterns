package compound.duck

import compound.Quackable
import logging.logger

class RubberDuck : Quackable {
    override fun quack() {
        logger.info { "삑삑" }
    }
}