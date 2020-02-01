package sid.coursera.week1

import org.junit.jupiter.api.Assertions.*

internal class SumOfDigitsKtTest {

    @org.junit.jupiter.api.Test
    fun `Adding 1 and 4 should give 5`() {
        val problem = SumOfDigits(1, 4)
        assertEquals(5, problem.solve())
    }
}