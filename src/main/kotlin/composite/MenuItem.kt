package composite

import logging.logger

class MenuItem(
    override val name: String,
    override val description: String,
    override val price: Double,
    override val vegetarian: Boolean
) : MenuComponent {
    override fun print() {
        logger.info { "  $name" + (if (vegetarian) "(v)" else "") + ", $price" }
        logger.info { "    -- $description" }
    }
}