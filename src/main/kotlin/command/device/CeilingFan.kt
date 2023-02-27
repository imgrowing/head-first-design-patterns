package command.device

import logging.logger

class CeilingFan(val name: String) {
    fun high() = logger.info { "  ${javaClass.simpleName}($name) - high" }
    fun off() = logger.info { "  ${javaClass.simpleName}($name) - off" }
}