package sid.coursera.sedgewick.week1

import java.util.*

class UnionFind (private val n: Int) {

    private var mappingArray = IntArray(n) { it }

    private fun isIncorrectIndex(p: Int, q: Int): Boolean {
         return p >= n || q >= n
    }

    fun union(p: Int, q: Int) {
        if(isIncorrectIndex(p, q)) { return }
        if(connected(p, q)) { return }

        val valueToChange = mappingArray[p]
        val valuesToChange = mappingArray[q]
        for (i in mappingArray.indices) {
            if(mappingArray[i] == valuesToChange) {
                mappingArray[i] = valueToChange
            }
        }
    }

    fun state(): IntArray {
        return mappingArray
    }

    override fun toString(): String {
        return mappingArray.contentToString()
    }

    fun connected(p: Int, q: Int): Boolean {
        if(isIncorrectIndex(p, q)) { return false }
        
        return mappingArray[p] == mappingArray[q]
    }


//    class Node(private val t: Int) {
//
//    }
}