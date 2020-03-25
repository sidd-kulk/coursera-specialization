package sid.coursera.sedgewick.week1

class QuickUnion(private val n: Int) {

    private var mappingArray = IntArray(n) { it }

    private fun isIncorrectIndex(p: Int, q: Int): Boolean {
        return p >= n || q >= n
    }

    private fun root(i: Int): Int {
        var j = i
        while(j != mappingArray[j]) j = mappingArray[j]
        return j
    }

    fun state(): IntArray {
        return mappingArray
    }

    fun union(p: Int, q: Int) {
        if(isIncorrectIndex(p, q)) { return }

        val i = root(p)
        val j = root(q)

        mappingArray[i] = j

    }

    fun connected(p: Int, q: Int): Boolean {
        return root(p) == root(q)
    }
}