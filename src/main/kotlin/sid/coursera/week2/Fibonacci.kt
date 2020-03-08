package sid.coursera.week2



fun fibonacci(till: Int): Int {
    val cache = mutableMapOf<Int, Int>()

    fun fibonacci(till: Int, cache: Map<Int, Int>): Int{
        if(till <= 1) return till;

        val fibTill1: Int = cache[till - 1] ?: fibonacci(till - 1, cache)
        val fibTill2: Int = cache[till - 2] ?: fibonacci(till - 2, cache)

        return fibTill1 + fibTill2
    }

    return fibonacci(till, cache)

}