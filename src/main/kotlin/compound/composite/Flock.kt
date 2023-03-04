package compound.composite

import compound.Quackable

class Flock(
    vararg val quackers: Quackable
) : Quackable {
    override fun quack() {
        quackers.forEach { it.quack() }
    }
}