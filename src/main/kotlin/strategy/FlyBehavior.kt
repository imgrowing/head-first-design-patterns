package strategy

import logging.logger

interface FlyBehavior {
    fun fly()
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        logger.info { "날개로 날아요." }
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        logger.info { "저는 못 날아요." }
    }
}

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        logger.info { "로켓 추진으로 날아갑니다." }
    }
}