package sid.coursera.week1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.lang.IllegalArgumentException

internal class MaximumMultiPairwiseProductTest {

    @Test
    fun `Maximum Pairwise Product`() {
        val problem = MaximumMultiPairwiseProduct(arrayOf(2,1,5,4,7,0), 3)
        assertEquals(140, problem.solve())
    }

    @Test
    fun `Maximum Pairwise Product Large numbers`() {
        val problem = MaximumMultiPairwiseProduct(arrayOf(1000000, 3000000), 2)
        assertEquals(3000000000000, problem.solve())
    }

    @Test
    fun `Maximum Pairwise Product Negative numbers`() {
        val smallProblem = MaximumMultiPairwiseProduct(arrayOf(-5, -2, 8, 0, -9), 2)
        val largeProblem = MaximumMultiPairwiseProduct(arrayOf(-5, -2, 8, 0, -9, 8, -21, 5 -6, 8, 12), 6)

        assertEquals(45, smallProblem.solve())
        assertEquals(1161216, largeProblem.solve())
    }

    @Test()
    fun `fails if take greater than array size or when take is zero or less or when array is empty`() {
        arrayOf(MaximumMultiPairwiseProduct(arrayOf(2), 3),
                MaximumMultiPairwiseProduct(arrayOf(2), -2),
                MaximumMultiPairwiseProduct(arrayOf(), 2))
                    .forEach { assertThrows(IllegalArgumentException::class.java) {it.solve()}}

    }
}