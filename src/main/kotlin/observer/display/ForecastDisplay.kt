package observer.display

import logging.logger
import observer.DisplayElement
import observer.Observer
import observer.subject.WeatherData

class ForecastDisplay(
    private var weatherData: WeatherData?,
    private var currentPressure: Double = 0.0,
    private var lastPressure: Double = 0.0,
) : Observer, DisplayElement {

    init {
        weatherData?.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        this.lastPressure = this.currentPressure
        this.currentPressure = pressure
        display()
    }

    override fun display() {
        var message = "기상 예보: "
        message += when {
            currentPressure > lastPressure -> "날씨가 좋아지고 있습니다!"
            currentPressure < lastPressure -> "쌀쌀하며 비가 올 것 같습니다."
            else -> "지금과 비슷할 것 같습니다."
        }
        logger.info { message }
    }
}