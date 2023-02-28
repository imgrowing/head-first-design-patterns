package templatemethod.barista

import logging.logger

abstract class CaffeineBeverage {
    fun prepareRecipe() { // template method
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) { // hook method
            addCondiments()
        }
        afterPrepare() // hook method
    }

    open fun boilWater() {
        logger.info { "물 끓이는 중" }
    }

    abstract fun brew()

    open fun pourInCup() {
        logger.info { "컵에 따르는 중" }
    }

    open fun customerWantsCondiments(): Boolean {
        return true
    }

    abstract fun addCondiments()

    open fun afterPrepare() {
        logger.info { "beverage prepared" }
    }
}