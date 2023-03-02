package state.gumball

import logging.logger
import state.gumball.GumballState.*

class GumballMachine(
    var gumballCount: Int = 0,
    var state: GumballState = if (gumballCount > 0) NO_QUARTER else SOLD_OUT,
) {
    fun insertQuarter() {
        when (state) {
            HAS_QUARTER -> logger.info { "동전은 한 개만 넣어주세요." }
            NO_QUARTER -> {
                state = HAS_QUARTER
                logger.info { "동전을 넣었습니다." }
            }
            SOLD_OUT -> logger.info { "매진되었습니다. 다음 기회에 이용해 주세요." }
            SOLD -> logger.info { "알맹이를 내보내고 있습니다." }
        }
    }

    fun ejectQuarter() {
        when (state) {
            HAS_QUARTER -> {
                logger.info { "동전이 반환됩니다." }
                state = NO_QUARTER
            }
            NO_QUARTER -> logger.info { "동전을 넣어 주세요." }
            SOLD -> logger.info { "이미 알맹이를 뽑았습니다(알맹이 내보내는 중)." }
            SOLD_OUT -> logger.info { "동전을 넣지 않았습니다. 동전이 반환되지 않습니다." }
        }
    }

    fun turnCrank() {
        when (state) {
            SOLD -> logger.info { "손잡이는 한 번만 돌려 주세요(알맹이 내보내는 중)." }
            NO_QUARTER -> logger.info { "동전을 넣어 주세요." }
            SOLD_OUT -> logger.info { "매진되었습니다." }
            HAS_QUARTER -> {
                logger.info { "손잡이를 돌렸습니다." }
                state = SOLD
                dispense()
            }
        }
    }

    private fun dispense() {
        when (state) {
            SOLD -> {
                logger.info { "알맹이를 내보내고 있습니다." }
                gumballCount--
                if (gumballCount == 0) {
                    state = SOLD_OUT
                    logger.info { "알맹이를 내보냈습니다." }
                    logger.info { "더 이상 알맹이가 없습니다." }
                } else {
                    state = NO_QUARTER
                    logger.info { "알맹이를 내보냈습니다." }
                }
            }
            NO_QUARTER -> logger.info { "동전을 넣어 주세요." }
            SOLD_OUT -> logger.info { "매진되었습니다." }
            HAS_QUARTER -> logger.info { "알맹이를 내보낼 수 없습니다." }
        }
    }

    fun refill(numGumballs: Int) {
        gumballCount = numGumballs
        state = NO_QUARTER
    }

    override fun toString(): String {
        return "*** 주식회사 왕뽑기 기계(남은 개수=$gumballCount, ${state.description}) ***"
    }
}