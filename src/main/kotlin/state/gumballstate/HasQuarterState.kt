package state.gumballstate

import logging.logger
import java.security.SecureRandom
import java.util.*

class HasQuarterState(
    private val gumballMachine: GumballMachine,
    private val randomWinner: Random = SecureRandom()
) : State {
    override fun insertQuarter() {
        logger.info { "동전은 한 개만 넣어주세요." }
    }

    override fun ejectQuarter() {
        logger.info { "동전이 반환됩니다." }
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        logger.info { "손잡이를 돌렸습니다." }

        val randomInt = randomWinner.nextInt(10)
        val isWinner = randomInt == 0

        if (isWinner && gumballMachine.gumballCount > 1) { // 당첨이고, 알맹이가 2개 이상
            gumballMachine.state = gumballMachine.winnerState
        } else {
            gumballMachine.state = gumballMachine.soldState
        }
    }

    override fun dispense() {
        logger.info { "알맹이를 내보낼 수 없습니다." }
    }
}