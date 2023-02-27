package command.command

class MacroCommand(
    private val commands: List<Command>
) : Command {
    override fun execute() {
        commands.forEach { it.execute() }
    }
}