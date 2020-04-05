package sid.coursera.sedgewick.week1

class ThreeSumProblem(private val numArray: Array<Int>) {

    fun solveBruteForce(): Int {
        val size = numArray.size
        var count = 0
        for(i in 0 until size){
            for(j in i+1 until size){
                for(k in j+1 until size){
                    if(numArray[i] + numArray[j] + numArray[k] == 0) {
                        count++
                    }
                }
            }
        }
        return count
    }
}