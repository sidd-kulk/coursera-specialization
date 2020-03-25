package sid.coursera.sedgewick.week1

class QuickUnion(private val n: Int, private val weighted: Boolean = false) {

    private var mappingArray = IntArray(n) { it }
    private var sizeArray = IntArray(n) {0}

    private fun isIncorrectIndex(p: Int, q: Int): Boolean {
        return p >= n || q >= n
    }

    private fun root(i: Int): Int {
        var j = i
        while(j != mappingArray[j]) {
            mappingArray[i] = mappingArray[mappingArray[i]] // Path compression
            j = mappingArray[j]
        }
        return j
    }

    fun state(): IntArray {
        return mappingArray
    }

    fun union(p: Int, q: Int) {
        return if(!weighted){
            unweightedUnion(p, q)
        }else {
            weightedUnion(p, q)
        }
    }

    private fun weightedUnion(p: Int, q: Int) {
        if (isIncorrectIndex(p, q)) {
            return
        }
        val i = root(p)
        val j = root(q)

        if (i == j) return

        if (sizeArray[i] < sizeArray[j]) {
            mappingArray[i] = j
            sizeArray[j] = sizeArray[i]
        } else {
            mappingArray[j] = i
            sizeArray[i] = sizeArray[j]
        }
    }

    private fun unweightedUnion(p: Int, q: Int) {
        if(isIncorrectIndex(p, q)) { return }

        val i = root(p)
        val j = root(q)

        mappingArray[i] = j

    }

    fun connected(p: Int, q: Int): Boolean {
        return root(p) == root(q)
    }
}