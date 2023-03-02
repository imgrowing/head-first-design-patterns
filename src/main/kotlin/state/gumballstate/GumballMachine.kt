package state.gumballstate

import logging.logger

class GumballMachine(
    var gumballCount: Int = 0,
) {
    val noQuarterState: State = NoQuarterState(this)
    val hasQuarterState: State = HasQuarterState(this)
    val soldState: State = SoldState(this)
    val soldOutState: State = SoldOutState(this)
    val winnerState: State = WinnerState(this)

    var state: State = if (gumballCount > 0) noQuarterState else soldOutState

    fun insertQuarter() = state.insertQuarter()

    fun ejectQuarter() = state.ejectQuarter()

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        logger.info { "알맹이를 내보내고 있습니다." }
        if (gumballCount > 0) {
            gumballCount--
        }
    }

    fun refill(numGumballs: Int) {
        gumballCount = numGumballs
        state = noQuarterState
    }

    override fun toString(): String {
        return "*** 주식회사 왕뽑기 기계(남은 개수=$gumballCount, $state) ***"
    }
}