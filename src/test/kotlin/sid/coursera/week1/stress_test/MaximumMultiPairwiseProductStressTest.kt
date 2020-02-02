package sid.coursera.week1.stress_test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import sid.coursera.week1.MaximumMultiPairwiseProduct
import sid.coursera.week1.Problem

class MaximumMultiPairwiseProductStressTest {
    class BasicTest {
        @Test
        fun `Maximum Pairwise Product`() {
            val problem = MaximumMultiPairwiseProductAlternate(arrayOf(2,1,5,4,7,0), 2)
            assertEquals(35, problem.solve());
        }

        @Test
        fun `Maximum Pairwise Product Large numbers`() {
            val problem = MaximumMultiPairwiseProductAlternate(arrayOf(1000000, 3000000), 2)
            assertEquals(3000000000000, problem.solve());
        }
    }

    @Test
    fun `stress Test`(){
        fun stressTestStep(input: Array<Int>): Boolean {
            val mainSolution = MaximumMultiPairwiseProduct(input, 2)
            val alternateSolution = MaximumMultiPairwiseProductAlternate(input, 2)

            return mainSolution.solve().equals(alternateSolution.solve())
        }

        for (i in 0..50) {
            val input = randomInput()
            if(!stressTestStep(input)){
                println("Test - $i failed with input: $input")
                break
            } else {
                continue
            }
        }
    }


}

private class MaximumMultiPairwiseProductAlternate(private val array: Array<Int>, take: Int): Problem <Long> {
    override fun solve(): Long {
        var product = 0L;
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