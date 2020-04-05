package sid.coursera.sedgewick.week1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ThreeSumProblemTest {

    @Test
    fun `Brute Force`() {
        fun `should return 4 for the given array of numbers`() {
            val input = arrayOf<Int>(30, -40, -20, -10, 40, 0, 10, 5)

            val problem = ThreeSumProblem(input)
            val solution = problem.solveBruteForce()

            assertEquals(4, solution)
        }
    }
}