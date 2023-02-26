package observer

import observer.Observer

interface Subject {

    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}