package composite

class Waitress(private val allMenus: MenuComponent) {
    fun printMenu() = allMenus.print()
}