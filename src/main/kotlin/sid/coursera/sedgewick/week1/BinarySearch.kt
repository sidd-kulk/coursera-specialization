package sid.coursera.sedgewick.week1

class BinarySearch(private val array: Array<Int>) {
    private val sortedArray: Array<Int> = array.sorted().toTypedArray(); // nlogn

    fun searchIterative(num: Int): Boolean {
        var lower = 0
        var higher = sortedArray.size - 1

        while(lower <= higher){
            val mid = lower + ((higher - lower)/2)
            when {
                num < sortedArray[mid] -> higher = mid - 1
                num > sortedArray[mid] -> lower = mid + 1
                else -> return true
            }
        }

        return false
    }
}
