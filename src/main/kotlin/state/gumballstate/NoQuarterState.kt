package state.gumballstate

import logging.logger

class NoQuarterState(
    private val gumballMachine: GumballMachine,
) : State {
    override fun insertQuarter() {
        logger.info { "동전을 넣었습니다." }
        gumballMachine.state = gumballMachine.hasQuarterState
    }

    override fun ejectQuarter() {
        logger.info { "동전을 넣어 주세요." }
    }

    override fun turnCrank() {
        logger.info { "동전을 넣어 주세요." }
    }

    override fun dispense() {
        logger.info { "동전을 넣어 주세요." }
    }
}