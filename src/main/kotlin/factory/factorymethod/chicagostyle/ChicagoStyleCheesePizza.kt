package factory.factorymethod.chicagostyle

import factory.factorymethod.Pizza
import logging.logger

class ChicagoStyleCheesePizza(
    name: String = "시카고 스타일 딥 디쉬 치즈 피자",
    dough: String = "아주 두꺼운 크러스트 도우",
    sauce: String = "플럼 토마토 소스",
    toppings: List<String> = listOf("잘게 조각낸 모짜렐라 치즈")
) : Pizza(name = name, dough = dough, sauce = sauce, toppings = toppings) {
    override fun cut() {
        logger.info { "네모난 모양으로 피자 자르기" }
    }
}
