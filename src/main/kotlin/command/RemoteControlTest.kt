package command

import command.command.Command
import command.command.GarageDoorUpCommand
import command.command.LightOnCommand
import command.device.GarageDoor
import command.device.Light

fun main() {
    val remote = SimpleRemoteControl()

    val light = Light("Living Room")
    val lightOn: Command = LightOnCommand(light)
    remote.command = lightOn
    remote.buttonWasPressed()

    val garageDoor = GarageDoor("Garage")
    val garageOpen: Command = GarageDoorUpCommand(garageDoor)
    remote.command = garageOpen
    remote.buttonWasPressed()
}