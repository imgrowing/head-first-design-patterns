package command.command

import command.device.GarageDoor

class GarageDoorUpCommand(
    private val garageDoor: GarageDoor,
) : Command {
    override fun execute() {
        garageDoor.up()
    }
}