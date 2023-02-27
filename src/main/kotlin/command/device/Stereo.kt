package command.device

import logging.logger
class Stereo(val name: String) {
    fun on() = logger.info { "  ${javaClass.simpleName}($name) - on" }
    fun off() = logger.info { "  ${javaClass.simpleName}($name) - off" }
    fun setCd() = logger.info { "  ${javaClass.simpleName}($name) - setCd" }
    fun setDvd() = logger.info { "  ${javaClass.simpleName}($name) - setDvd" }
    fun setRadio() = logger.info { "  ${javaClass.simpleName}($name) - setRadio" }
    fun setVolume(volume: Int) = logger.info { "  ${javaClass.simpleName}($name) - setVolume($volume)" }
}

