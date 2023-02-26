package factory.factorymethod.nystyle

import factory.factorymethod.Pizza

class NYStyleCheesePizza(
    name: String = "뉴욕 스타일 소스와 치즈 피자",
    dough: String = "씬 크러스트 도우",
    sauce: String = "마리나라 소스",
    toppings: List<String> = listOf("잘게 썬 레지아노 치즈")
) : Pizza(name = name, dough = dough, sauce = sauce, toppings = toppings)
