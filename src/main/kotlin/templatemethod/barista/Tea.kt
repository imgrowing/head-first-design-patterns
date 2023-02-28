package templatemethod.barista

import logging.logger

class Tea : CaffeineBeverage() {
    override fun brew() {
        logger.info { "찻잎을 우려내는 중" }
    }

    override fun addCondiments() {
        logger.info { "레몬을 추가하는 중" }
    }
}