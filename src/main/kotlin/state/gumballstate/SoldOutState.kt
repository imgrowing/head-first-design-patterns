package state.gumballstate

import logging.logger

class SoldOutState(
    private val gumballMachine: GumballMachine,
) : State {
    override fun insertQuarter() {
        logger.info { "매진되었습니다. 다음 기회에 이용해 주세요." }
    }

    override fun ejectQuarter() {
        logger.info { "동전을 넣지 않았습니다. 동전이 반환되지 않습니다." }
    }

    override fun turnCrank() {
        logger.info { "매진되었습니다." }
    }

    override fun dispense() {
        logger.info { "매진되었습니다." }
    }

    override fun refill() {
        gumballMachine.state = gumballMachine.noQuarterState
    }
}