package sid.coursera.week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GreatestCommonDivisorKtTest {

    @Test
    fun `GCD Tests`() {
        assertEquals(2, greatestCommonDivisor(4, 10))
        assertEquals(4, greatestCommonDivisor(8, 20))
        assertEquals(81, greatestCommonDivisor(81, 729))
    }
}