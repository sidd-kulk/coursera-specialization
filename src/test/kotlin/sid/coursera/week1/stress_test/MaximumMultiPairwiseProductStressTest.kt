package sid.coursera.week1.stress_test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import sid.coursera.week1.MaximumMultiPairwiseProduct
import sid.coursera.week1.Problem
import java.util.*
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

const val TAKE = 2

class MaximumMultiPairwiseProductStressTest {
    class BasicTest {
        @Test
        fun `Maximum Pairwise Product`() {
            val problem = MaximumMultiPairwiseProductAlternate(arrayOf(2,1,5,4,7,0), TAKE)
            assertEquals(35, problem.solve())
        }

        @Test
        fun `Maximum Pairwise Product Large numbers`() {
            val problem = MaximumMultiPairwiseProductAlternate(arrayOf(1000000, 3000000), TAKE)
            assertEquals(3000000000000, problem.solve())
        }
    }

    @Test
    fun `stress Test`(){
        fun stressTestStep(input: Array<Int>, withPerf: Boolean = false): Boolean {

            val problemWithMainstreamSolution = MaximumMultiPairwiseProduct(input, TAKE)
            val problemWithAlternateSolution = MaximumMultiPairwiseProductAlternate(input, TAKE)

            if(withPerf){
                checkPerf(input)
            }

            return problemWithMainstreamSolution.solve().equals(problemWithAlternateSolution.solve())
        }

        for (i in 0..50000) {
            val input = randomInput()
            assert(stressTestStep(input)) { "Stress Test Failed with index $i and input ${input[i]}" }
        }

    }

    private fun checkPerf(input: Array<Int>){ // Call on demand
        val problemWithMainstreamSolution = MaximumMultiPairwiseProduct(input, TAKE)
        val problemWithAlternateSolution = MaximumMultiPairwiseProductAlternate(input, TAKE)

        val mainstreamSolutionTime = measureNanoTime { problemWithMainstreamSolution.solve() }
        val alternateSolutionTime = measureNanoTime { problemWithAlternateSolution.solve() }

        // failing for some reason
        require(mainstreamSolutionTime < alternateSolutionTime) {"$mainstreamSolutionTime and $alternateSolutionTime for ${input.contentToString()}"}
    }


}

private class MaximumMultiPairwiseProductAlternate(private val array: Array<Int>, take: Int): Problem <Long> {
    override fun solve(): Long {
        var product = 0L
        for ((i, x) in array.withIndex()){
            for((j, y) in array.drop(i+1).withIndex()){
                val temp = x.toLong() * y.toLong()
                if(temp > product){
                    product = temp
                }
            }
        }
        return product
    }
}

private fun randomInput(): Array<Int>{
    val list = mutableListOf<Int>()
    val numberOfElements: Int = (2..10).random()
    for (num in 0 .. numberOfElements){
        list.add((0 .. 100000).random())
    }

    return list.toTypedArray()

}