package compound.goose

import compound.Quackable

class GooseAdapter(
    private val goose: Goose
) : Quackable {
    override fun quack() {
        goose.honk()
    }
}