package sid.coursera.week1


class SumOfDigits(val a: Int, val b: Int): Problem<Int> {
    private fun sumOfDigits() = a + b
    override fun solve(): Int {
        return sumOfDigits()
    }
}

