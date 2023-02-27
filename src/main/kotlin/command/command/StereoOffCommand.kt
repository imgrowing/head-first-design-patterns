package command.command

import command.device.Stereo

class StereoOffCommand(
    private val stereo: Stereo
) : Command {
    override fun execute() {
        stereo.off()
    }
}