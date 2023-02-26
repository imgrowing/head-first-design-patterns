package decorator.iodecorator

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(
    inputStream: InputStream
) : FilterInputStream(inputStream) {
    override fun read(): Int {
        val c: Int = `in`.read()
        return if (c == -1) {
            c
        } else {
            Character.toLowerCase(c)
        }
    }

    override fun read(byteArray: ByteArray, off: Int, len: Int): Int {
        `in`.read(byteArray, off, len)

        byteArray.forEachIndexed { index, byte ->
            byteArray[index] = Character.toLowerCase(byte.toInt()).toByte()
        }

        return byteArray.size
    }
}