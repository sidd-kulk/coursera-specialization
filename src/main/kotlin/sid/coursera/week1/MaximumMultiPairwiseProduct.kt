package sid.coursera.week1

import java.lang.IllegalArgumentException

class MaximumMultiPairwiseProduct (private val array: Array<Int>, private val take: Int): Problem<Long> {

    override fun solve(): Long {
        if(array.size < take)  throw IllegalArgumentException("Check your parameters")

        return array.map {it.toLong()}.sorted().takeLast(take).reduce {acc, i -> i * acc}
    }
}