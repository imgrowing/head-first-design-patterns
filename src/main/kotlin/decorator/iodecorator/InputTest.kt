package decorator.iodecorator

import java.io.BufferedInputStream
import java.io.FilterInputStream

fun main() {
    getInputStream().use { inputStream ->
        var c: Int
        while ((inputStream.read().also { c = it }) > 0) {
            print(Char(c))
        }
        println()
    }

    getInputStream().use { inputStream ->
        val allBytes = ByteArray(70) // length of test.txt
        inputStream.read(allBytes)
        println(String(allBytes))
    }

}

private fun getInputStream(): FilterInputStream {
    val inputStream = object {}.javaClass.getResourceAsStream("/test.txt")!!
    return LowerCaseInputStream(
        BufferedInputStream(
            inputStream
        )
    )
}