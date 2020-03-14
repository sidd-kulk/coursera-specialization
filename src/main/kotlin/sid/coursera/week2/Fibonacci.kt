package sid.coursera.week2

fun fibonacciFirstN(firstN: Int): Int {
    val cache = mutableMapOf<Int, Int>()

    fun fibonacci(firstN: Int, cache: Map<Int, Int>): Int{
        if(firstN <= 1) return firstN;

        val fibTill1: Int = cache[firstN - 1] ?: fibonacci(firstN - 1, cache)
        val fibTill2: Int = cache[firstN - 2] ?: fibonacci(firstN - 2, cache)

        return fibTill1 + fibTill2
    }

    return fibonacci(firstN, cache)
}

fun fibonacciTill(till: Int): Int {
    var fibNMinus1 = 1

    var fibN = 1
    while(fibN + fibNMinus1 < till){
        val temp = fibN
        fibN += fibNMinus1
        fibNMinus1 = temp
    }

    return fibN
}