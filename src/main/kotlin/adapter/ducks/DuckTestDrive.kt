package adapter.ducks

import mu.KotlinLogging

val logger = KotlinLogging.logger("TestDrive")

fun main() {
    val duck: Duck = MallardDuck()

    val turkey: Turkey = WildTurkey()
    val turkeyAdapter: Duck = TurkeyAdapter(turkey)

    logger.info { "칠면조가 말하길 ---" }
    turkey.gobble()
    turkey.fly()

    logger.info { "오리가 말하길 ---" }
    testDuck(duck)

    logger.info { "칠면조 어댑터가 말하길 ---" }
    testDuck(turkeyAdapter)
}

private fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}