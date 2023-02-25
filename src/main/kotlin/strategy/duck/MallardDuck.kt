package strategy.duck

import logging.logger
import strategy.Duck
import strategy.FlyWithWings
import strategy.Quack

class MallardDuck : Duck(Quack(), FlyWithWings()) {
    override fun display() {
        logger.info { "저는 물오리 입니다." }
    }
}