package compound.decorator

import compound.Quackable

class QuackCounter(
    private val quackable: Quackable
) : Quackable {
    override fun quack() {
        quackable.quack()
        numberOfQuacks++
    }

    companion object {
        var numberOfQuacks: Int = 0
    }
}