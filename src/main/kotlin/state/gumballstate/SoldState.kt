package state.gumballstate

import logging.logger

class SoldState(
    private val gumballMachine: GumballMachine,
) : State {
    override fun insertQuarter() {
        logger.info { "알맹이를 내보내고 있습니다." }
    }

    override fun ejectQuarter() {
        logger.info { "이미 알맹이를 뽑았습니다(알맹이 내보내는 중)." }
    }

    override fun turnCrank() {
        logger.info { "손잡이는 한 번만 돌려 주세요(알맹이 내보내는 중)." }
    }

    override fun dispense() {
        logger.info { "알맹이를 내보내고 있습니다." }
        gumballMachine.releaseBall()

        if (gumballMachine.gumballCount > 0) {
            gumballMachine.state = gumballMachine.noQuarterState
            logger.info { "알맹이를 내보냈습니다." }
        } else {
            gumballMachine.state = gumballMachine.soldOutState
            logger.info { "알맹이를 내보냈습니다." }
            logger.info { "더 이상 알맹이가 없습니다." }
        }
    }
}