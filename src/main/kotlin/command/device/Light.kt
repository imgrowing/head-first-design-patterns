package command.device

import logging.logger

class Light(val name: String) {
    fun on() = logger.info { "  ${javaClass.simpleName}($name) - on" }
    fun off() = logger.info { "  ${javaClass.simpleName}($name) - off" }
}
