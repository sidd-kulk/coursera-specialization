package sid.coursera.week1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.lang.IllegalArgumentException

internal class MaximumMultiPairwiseProductTest () {

    @Test
    fun `Maximum Pairwise Product`() {
        val problem = MaximumMultiPairwiseProduct(arrayOf(2,1,5,4,7,0), 3)
        assertEquals(140, problem.solve());
    }

    @Test
    fun `Maximum Pairwise Product Large numbers`() {
        val problem = MaximumMultiPairwiseProduct(arrayOf(1000000, 3000000), 2)
        assertEquals(3000000000000, problem.solve());
    }

    @Test()
    fun `fails if take greater than array size`() {
        val problem = MaximumMultiPairwiseProduct(arrayOf(2), 2)
        assertThrows(IllegalArgumentException::class.java) {problem.solve()}
    }
}