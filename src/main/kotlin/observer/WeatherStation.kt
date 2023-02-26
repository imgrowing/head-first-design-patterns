package observer

import observer.display.CurrentConditionDisplay
import observer.display.ForecastDisplay
import observer.display.StatisticsDisplay
import observer.subject.WeatherData

fun main() {
    val weatherData = WeatherData()

    CurrentConditionDisplay(weatherData)
    StatisticsDisplay(weatherData)
    ForecastDisplay(weatherData)

    weatherData.changeMeasurements(temperature = 80.0, humidity = 65.0, pressure = 30.4)
    weatherData.changeMeasurements(temperature = 82.0, humidity = 70.0, pressure = 29.2)
    weatherData.changeMeasurements(temperature = 78.0, humidity = 90.0, pressure = 29.2)
}