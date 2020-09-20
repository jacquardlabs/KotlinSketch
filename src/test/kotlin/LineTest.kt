import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LineTest {

    @Test
    fun lineConstructor() {
        val startPoint = Point(0, 1)
        val endPoint = Point(3, 4)
        val line = Line(startPoint, endPoint)

        Assertions.assertEquals(startPoint, line.start)
        Assertions.assertEquals(endPoint, line.end)
    }
}