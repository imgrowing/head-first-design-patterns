package observer.display

import logging.logger
import observer.DisplayElement
import observer.Observer
import observer.subject.WeatherData

class StatisticsDisplay(
    private var weatherData: WeatherData?,
    private var maxTemperature: Double = Double.MIN_VALUE,
    private var minTemperature: Double = Double.MAX_VALUE,
    private var temperatureSum: Double = 0.0,
    private var numReadings: Int = 0,
) : Observer, DisplayElement {

    init {
        weatherData?.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        temperatureSum += temperature
        numReadings++
        maxTemperature = maxOf(temperature, maxTemperature)
        minTemperature = minOf(temperature, minTemperature)
        display()
    }

    override fun display() {
        logger.info { "평균/최고/최저 온도 = ${temperatureSum / numReadings} / $maxTemperature / $minTemperature" }
    }
}