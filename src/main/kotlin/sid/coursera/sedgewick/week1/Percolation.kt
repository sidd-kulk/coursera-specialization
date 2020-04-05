package sid.coursera.sedgewick.week1

// TODO - Unsolved like the NP complete problem.  Come back later.

class Grid(private val gridX: Int, private val gridY: Int, private val openSites: IntArray = IntArray(0)) { // openSites has to be in order of index of grid
    private val gridArray = IntArray(gridX * gridY - 1) {it}    // because index starts with 0

    init {
        if(openSites.isNotEmpty()){ // 0 1 3 8 11 13 14 15 17 20 21 23 24
            openSites.indices.forEach{ i ->

            }
        }
    }

    private fun union(p: Int, q: Int) {
//        while(p != gridArray[q])
    }

    private fun connected(p: Int, q: Int){

    }

    fun isPercolating(): Boolean {
        return false
    }

}

