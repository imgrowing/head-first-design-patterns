package factory.simplefactory

import logging.logger

abstract class Pizza(
    val name: String,
    val dough: String,
    val sauce: String,
    val toppings: List<String>,
) {
    open fun prepare() {
        logger.info { "준비 중: $name" }
        logger.info { "도우를 돌리는 중..." }
        logger.info { "소스를 뿌리는 중..." }
        logger.info { "토핑을 올리는 중..." }
        toppings.forEach { logger.info { " $it" } }
    }

    open fun bake() {
        logger.info { "175도에서 25분 간 굽기" }
    }

    open fun cut() {
        logger.info { "피자를 사선으로 자르기" }
    }

    open fun box() {
        logger.info { "상자에 피자 담기" }
    }

    override fun toString(): String {
        return "Pizza(name='$name', dough='$dough', sauce='$sauce', toppings=$toppings)"
    }
}