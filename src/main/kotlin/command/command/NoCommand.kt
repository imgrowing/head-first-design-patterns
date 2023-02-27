package command.command

import logging.logger

class NoCommand : Command {
    override fun execute() {
        logger.info { "  empty" }
    }

    companion object {
        val INSTANCE: Command = NoCommand()
    }
}