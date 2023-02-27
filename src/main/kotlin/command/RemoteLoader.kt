package command

import command.command.*
import command.device.CeilingFan
import command.device.GarageDoor
import command.device.Light
import command.device.Stereo
import mu.KotlinLogging

val logger = KotlinLogging.logger("RemoteLoader")

fun main() {
    val remoteControl = RemoteControl()

    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val ceilingFan = CeilingFan("Living Room")
    val garageDoor = GarageDoor("Garage")
    val stereo = Stereo("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)

    val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

    val garageDoorUp = GarageDoorUpCommand(garageDoor)
    val garageDoorDown = GarageDoorDownCommand(garageDoor)

    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    val macroOnCommand = MacroCommand(listOf(livingRoomLightOn, ceilingFanOn, stereoOnWithCD))
    val macroOffCommand = MacroCommand(listOf(livingRoomLightOff, ceilingFanOff, stereoOff))

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff)
    remoteControl.setCommand(3, stereoOnWithCD, stereoOff)
    remoteControl.setCommand(4, macroOnCommand, macroOffCommand)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    logger.info { remoteControl }
    remoteControl.undoButtonWasPushed()

    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(0)
    logger.info { remoteControl }
    remoteControl.undoButtonWasPushed()

    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)
    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)
    remoteControl.onButtonWasPushed(3)
    remoteControl.offButtonWasPushed(3)
    remoteControl.onButtonWasPushed(4)
    remoteControl.offButtonWasPushed(4)
    remoteControl.onButtonWasPushed(5)
    remoteControl.offButtonWasPushed(5)
}