package sid.coursera.week2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class FibonacciTest {
    @Test
    fun `Fibonacci till 5 is 3`() {
        assertEquals(5, fibonacci(5))
    }

    @Test
    fun `Fibonacci till 10 is 55`() {
        assertEquals(55, fibonacci(10))
    }

    @Test
    fun `Fibonacci till 20 is 6365`() {
        assertEquals(6765, fibonacci(20))
    }

    @Test
    fun `Fibonacci till 30 is 832040`() {
        assertEquals(832040, fibonacci(30))
    }
}