package logging

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
class LoggingTest {
    fun log() {
        logger.warn { "warning message" }
    }
}

fun main() {
    LoggingTest().log()
}
