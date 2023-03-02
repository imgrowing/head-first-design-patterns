package state.gumball

enum class GumballState(val description: String) {
    SOLD_OUT("알맹이 매진"),
    NO_QUARTER("동전 없음"),
    HAS_QUARTER("동전 있음"),
    SOLD("알맹이 판매(+내보내는 중)")
}