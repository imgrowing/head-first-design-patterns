package composite

interface MenuComponent {
    val name: String
        get() = throw UnsupportedOperationException()

    val description: String
        get() = throw UnsupportedOperationException()

    val price: Double
        get() = throw UnsupportedOperationException()

    val vegetarian: Boolean
        get() = throw UnsupportedOperationException()

    fun print() {}

    fun add(menuComponent: MenuComponent): Unit = throw UnsupportedOperationException()

    fun remove(menuComponent: MenuComponent): Unit = throw UnsupportedOperationException()

    fun getChild(i: Int): MenuComponent = throw UnsupportedOperationException()
}