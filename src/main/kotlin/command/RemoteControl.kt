package command

import command.command.Command
import command.command.NoCommand

class RemoteControl() {
    private val onCommands: Array<Command> = Array(7) { NoCommand.INSTANCE }
    private val offCommands: Array<Command> = Array(7) { NoCommand.INSTANCE }
    private var undoCommand: Command = NoCommand.INSTANCE

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        logger.info { "on button pushed (slot $slot) ---------------" }
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        logger.info { "off button pushed (slot $slot) --------------" }
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        logger.info { "undo button pushed ---------------" }
        undoCommand.undo()
    }

    override fun toString(): String {
        var string = "\n----- 리모컨 -----\n"
        onCommands.indices.forEach { i ->
           string += "[slot $i] ${onCommands[i].javaClass.simpleName},   ${offCommands[i].javaClass.simpleName}\n"
        }
        string += "[undo] ${undoCommand.javaClass.simpleName}\n"
        return string
    }


}