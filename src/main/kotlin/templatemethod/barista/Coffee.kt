package templatemethod.barista

import logging.logger

class Coffee : CaffeineBeverage() {
    override fun brew() {
        logger.info { "필터로 커피를 우려내는 중" }
    }

    override fun addCondiments() {
        logger.info { "설탕과 우유를 추가하는 중" }
    }
}