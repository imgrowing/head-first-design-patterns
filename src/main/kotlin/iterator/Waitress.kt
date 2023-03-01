package iterator

import logging.logger

class Waitress(
    private val pancakeHouseMenuIterable: MenuIterable,
    private val dinerMenuIterable: MenuIterable,
) {
    fun printMenu() {
        val pancakeHouseMenuIterator: MenuIterator = pancakeHouseMenuIterable.createIterator()
        val dinerMenuIterator: MenuIterator = dinerMenuIterable.createIterator()

        logger.info { "메뉴" }
        logger.info { "----" }
        logger.info { "아침 메뉴" }
        printMenu(pancakeHouseMenuIterator)
        logger.info { "----" }
        logger.info { "점심 메뉴" }
        printMenu(dinerMenuIterator)
    }

    private fun printMenu(iterator: MenuIterator) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            logger.info { "${menuItem.name}: ${menuItem.price} -- ${menuItem.description}" }
        }
    }
}