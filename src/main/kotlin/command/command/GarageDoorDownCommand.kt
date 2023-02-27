package command.command

import command.device.GarageDoor

class GarageDoorDownCommand(
    private val garageDoor: GarageDoor,
) : Command {
    override fun execute() {
        garageDoor.down()
    }
}