package iterator

import logging.logger

class DinerMenu : MenuIterable {
    private var numberOfItems: Int = 0
    private val menuItems: Array<MenuItem?> = Array(MAX_ITEMS) { null }

    init {
        addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99)
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99)
        addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29)
        addItem("핫도그", "사워크라우드, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05)
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        if (numberOfItems >= MAX_ITEMS) {
            logger.info { "죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다." }
            return
        }

        val menuItem = MenuItem(name = name, description = description, vegetarian = vegetarian, price = price)
        menuItems[numberOfItems] = menuItem
        numberOfItems++
    }

    override fun createIterator(): MenuIterator {
        return DinerMenuIterator(menuItems)
    }

    companion object {
        const val MAX_ITEMS = 6
    }
}