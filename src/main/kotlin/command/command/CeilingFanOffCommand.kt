package command.command

import command.device.CeilingFan

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.off()
    }
}