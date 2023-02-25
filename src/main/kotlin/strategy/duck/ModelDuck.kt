package strategy.duck

import logging.logger
import strategy.Duck
import strategy.FlyNoWay
import strategy.Quack

class ModelDuck : Duck(Quack(), FlyNoWay()) {
    override fun display() {
        logger.info { "저는 모형 오리입니다." }
    }
}