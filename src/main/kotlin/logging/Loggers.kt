package logging

import mu.KLogger
import mu.KotlinLogging

val Any.logger: KLogger
    get() = KotlinLogging.logger(this::class.simpleName!!)

private val privateLogger = KotlinLogging.logger {}
class LoggingTest {
    fun log() {
        privateLogger.warn { "warning message" }
        logger.warn { "warning message" }
    }
}

fun main() {
    LoggingTest().log()
}
