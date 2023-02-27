package command

import command.command.Command
import logging.logger

class SimpleRemoteControl(
    var command: Command? = null
) {
    fun buttonWasPressed() {
        command?.execute() ?: logger.info { "null command" }
    }
}