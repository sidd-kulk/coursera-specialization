package sid.coursera.week1

import java.lang.IllegalArgumentException
import kotlin.math.abs

class MaximumMultiPairwiseProduct(private val array: Array<Int>, private val take: Int) : Problem<Long> {

    override fun solve(): Long {
        checkInput()

        val multiplierIndex = take - 1
        var max: Long = 0

        val sortedArrayWithAbsoluteValue = array.sortedWith(absoluteValueComparator())

        val product = sortedArrayWithAbsoluteValue
            .map { it.toLong() }
            .takeLast(multiplierIndex).reduce { acc, ele -> acc * ele }

        (sortedArrayWithAbsoluteValue.lastIndex - multiplierIndex downTo 0).forEach { i ->
            val productForIndex = product * sortedArrayWithAbsoluteValue[i]
            max = if (max <= productForIndex) productForIndex else max
        }

        return max
    }

    private fun absoluteValueComparator() = Comparator<Int> { i, j -> abs(i) - abs(j) }

    @Throws(IllegalArgumentException::class)
    private fun checkInput() {
        if (array.isNullOrEmpty() || array.size < take || take <= 0)
            throw IllegalArgumentException("Check your parameters")
    }
}