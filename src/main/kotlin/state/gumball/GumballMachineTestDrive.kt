package state.gumball

import mu.KotlinLogging

val logger = KotlinLogging.logger("GumballMachineTestDrive")

fun main() {
    val gumballMachine = GumballMachine(5)

    logger.info { gumballMachine }

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    logger.info { gumballMachine }

    gumballMachine.insertQuarter()
    gumballMachine.ejectQuarter()
    gumballMachine.turnCrank()

    logger.info { gumballMachine }

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.ejectQuarter()

    logger.info { gumballMachine }

    gumballMachine.insertQuarter()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    logger.info { gumballMachine }
}