package sid.coursera.week2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.system.measureNanoTime

internal class FibonacciTest {
    @Test
    fun `5th Fibonacci is 3`() {
        assertEquals(5, fibonacciFirstN(5))
    }

    @Test
    fun `10th Fibonacci is 55`() {
        assertEquals(55, fibonacciFirstN(10))
    }

    @Test
    fun `20th Fibonacci is 6365`() {
        assertEquals(6765, fibonacciFirstN(20))
    }

    @Test
    fun `30th Fibonacci is 832040`() {
        assertEquals(832040, fibonacciFirstN(30))
    }

    // --------------------------------//

    @Test
    fun `Fibonacci till 5 is 3`() {
        assertEquals(3, fibonacciTill(5))
    }

    @Test
    fun `Fibonacci till 10 is 8`() {
        assertEquals(8, fibonacciTill(10))
    }

    @Test
    fun `Fibonacci till 20 is 6765`() {
        assertEquals(6765, fibonacciFirstN(20))
    }

    @Test
    fun `Fibonacci till 30 is 832040`() {
        assertEquals(832040, fibonacciFirstN(30))
    }

}

internal class PerformanceTestFibonacci {
    @Test
    fun `Performance Testing`() {
        val fibonacciFirstNTimeList = mutableListOf<Long>()

        val TIMES = 100
        repeat(TIMES) {
            fibonacciFirstNTimeList.add(measureNanoTime { fibonacciFirstN((5..20).random()) })
        }

        println("Average time for fibonacciFirstN = ${fibonacciFirstNTimeList.average()}")

        val fibonacciTillList = mutableListOf<Long>()
        repeat(TIMES) {
            fibonacciTillList.add(measureNanoTime { fibonacciTill((10000..20000).random()) })
        }

        val assertionsList = mutableListOf<Boolean>()
        fibonacciFirstNTimeList.forEachIndexed { index, value ->
            assertionsList.add(value > fibonacciTillList[index])
        }

        assertTrue(assertionsList.all { true })

    }
}