package iterator

interface MenuIterator {
    fun hasNext(): Boolean
    fun next(): MenuItem
}