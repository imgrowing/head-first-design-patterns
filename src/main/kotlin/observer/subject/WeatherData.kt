package observer.subject

import logging.logger
import observer.Observer
import observer.Subject

class WeatherData(
    private val observers: MutableList<Observer> = mutableListOf(),
    private var temperature: Double = 0.0,
    private var humidity: Double = 0.0,
    private var pressure: Double = 0.0,
) : Subject {
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        logger.info { "새로운 측정값이 수신되었습니다." }
        notifyObservers()
    }

    fun changeMeasurements(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}