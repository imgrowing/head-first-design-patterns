package command.command

import command.device.Light

class LightOnCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.on()
    }
}