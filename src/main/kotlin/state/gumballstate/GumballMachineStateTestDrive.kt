package state.gumballstate

import mu.KotlinLogging

private val logger = KotlinLogging.logger("GumballMachineStateDrive")

fun main() {
    val gumballMachine = GumballMachine(5)
    logger.info { gumballMachine }

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    logger.info { gumballMachine }

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    logger.info { gumballMachine }
}