package command.command

import command.device.CeilingFan

class CeilingFanOnCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.high()
    }
}