package sid.coursera.week1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*;

internal class SumOfDigitsKtTest {

    @Test
    fun `Adding 1 and 4 should give 5`() {
        val problem = SumOfDigits(1, 4)
        assertEquals(5, problem.solve())
    }

    @Test
    fun `Adding 1 and 4 should not give 3`() {
        val problem = SumOfDigits(1, 4)
        assertNotEquals(4, problem.solve())
    }
}