package sid.coursera.week1


class SumOfDigits(private val a: Int, private val b: Int): Problem<Int> {
    private fun sumOfDigits() = a + b
    override fun solve(): Int {
        return sumOfDigits()
    }
}

