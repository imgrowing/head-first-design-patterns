package command.command

interface Command {
    fun execute()
    fun undo() {}
}