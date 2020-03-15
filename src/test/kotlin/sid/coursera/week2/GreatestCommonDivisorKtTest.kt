package sid.coursera.week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GreatestCommonDivisorKtTest {

    @Test
    fun `GCD Tests for brute force`() {
        assertEquals(2, greatestCommonDivisor(4, 10))
        assertEquals(4, greatestCommonDivisor(8, 20))
        assertEquals(81, greatestCommonDivisor(81, 729))
        assertEquals(61232, greatestCommonDivisor(3918848, 1653264))
        assertEquals(61232, greatestCommonDivisor(1653264, 3918848))
    }

    @Test
    fun `GCD Tests for euclidean algorithm`() {
        assertEquals(2, euclideanAlgorithm(4, 10))
        assertEquals(4, euclideanAlgorithm(8, 20))
        assertEquals(81, euclideanAlgorithm(81, 729))
        assertEquals(61232, euclideanAlgorithm(3918848, 1653264))
        assertEquals(61232, euclideanAlgorithm(1653264, 3918848))
    }
}