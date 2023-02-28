package adapter.ducks

import logging.logger

class WildTurkey : Turkey {
    override fun gobble() {
        logger.info { "골골" }
    }

    override fun fly() {
        logger.info { "짧은 거리를 날고 있어요!" }
    }
}