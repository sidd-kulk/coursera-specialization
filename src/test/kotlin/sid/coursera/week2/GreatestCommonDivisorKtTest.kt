package sid.coursera.week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.system.measureNanoTime

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

internal class PerformanceTestGCD {

    @Test
    fun `Performance Testing`() {
        val gcdBruteForceTimeList = mutableListOf<Long>()
        val assertionsList = mutableListOf<Boolean>()

        val TIMES = 100
        repeat(TIMES) {
            gcdBruteForceTimeList.add(measureNanoTime {
                greatestCommonDivisor(
                    (500..20000).random(),
                    (100..100000).random()
                )
            })
        }

        println("Average time for brute force GCD = ${gcdBruteForceTimeList.average()}")

        val gcdEuclideanTimeList = mutableListOf<Long>()
        repeat(TIMES) {
            gcdEuclideanTimeList.add(measureNanoTime {
                euclideanAlgorithm(
                    (500..20000).random(),
                    (100..100000).random()
                )
            })
        }

        println("Average time for euclidean algo = ${gcdEuclideanTimeList.average()}")

        gcdBruteForceTimeList.forEachIndexed { index, value ->
            assertionsList.add(value > gcdEuclideanTimeList[index])
        }
        assertTrue(assertionsList.all { true })
    }
}