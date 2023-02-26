package observer.display

import logging.logger
import observer.DisplayElement
import observer.Observer
import observer.subject.WeatherData

class CurrentConditionDisplay(
    private var weatherData: WeatherData?,
    private var temperature: Double = Double.MIN_VALUE,
    private var humidity: Double = 0.0,
) : Observer, DisplayElement {

    init {
        weatherData?.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        logger.info { "현재 상태: 온도 ${temperature}F, 습도 ${humidity}%" }
    }
}