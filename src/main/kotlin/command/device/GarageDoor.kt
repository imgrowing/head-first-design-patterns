package command.device

import logging.logger

class GarageDoor(private val name: String) {
    fun up() = logger.info { "  ${javaClass.simpleName}($name) - up" }
    fun down() = logger.info { "  ${javaClass.simpleName}($name) - down" }
    fun stop() = logger.info { "  ${javaClass.simpleName}($name) - stop" }
    fun lightOn() = logger.info { "  ${javaClass.simpleName}($name) - lightOn" }
    fun lightOff() = logger.info { "  ${javaClass.simpleName}($name) - lightOff" }
}