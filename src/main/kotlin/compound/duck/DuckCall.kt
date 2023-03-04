package compound.duck

import compound.Quackable
import logging.logger

class DuckCall : Quackable {
    override fun quack() {
        logger.info { "꽉꽉" }
    }
}