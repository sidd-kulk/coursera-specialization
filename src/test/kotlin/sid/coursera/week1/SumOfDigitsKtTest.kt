package sid.coursera.week1

import org.junit.jupiter.api.Assertions.*

internal class SumOfDigitsKtTest {

    @org.junit.jupiter.api.Test
    fun `Adding 1 and 3 should give 4`() {
        val sum = SumOfDigits()
        assertEquals(5, sum.sumOfDigits(1,4))
    }
}