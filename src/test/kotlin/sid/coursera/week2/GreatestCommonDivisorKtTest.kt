package sid.coursera.week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GreatestCommonDivisorKtTest {

    @Test
    fun `GCD of 4 & 10 should be 2`() {
        assertEquals(2, greatestCommonDivisor(arrayOf(4, 10)))
    }
}