package composite

import logging.logger

class Menu(
    override val name: String,
    override val description: String,
    private val menuComponents: MutableList<MenuComponent> = mutableListOf()
) : MenuComponent {
    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun print() {
        logger.info { "$name, $description" }
        logger.info { "-----------------------" }
        menuComponents.forEach { it.print() }
    }
}