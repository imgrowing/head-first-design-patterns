package iterator

class DinerMenuIterator(
    private val menuItems: Array<MenuItem?>
) : MenuIterator {
    private var position: Int = 0

    override fun hasNext(): Boolean {
        return (position < menuItems.size && menuItems[position] != null)
    }

    override fun next(): MenuItem {
        val menuItem: MenuItem = menuItems[position] ?: throw NoSuchElementException("원소가 없음")
        position++
        return menuItem
    }
}