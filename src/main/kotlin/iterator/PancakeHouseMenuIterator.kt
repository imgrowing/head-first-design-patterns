package iterator

class PancakeHouseMenuIterator(
    private val menuItems: List<MenuItem>
) : MenuIterator {
    private var position: Int = 0

    override fun hasNext(): Boolean {
        return (position < menuItems.size)
    }

    override fun next(): MenuItem {
        return menuItems[position].also {
            position++
        }
    }
}