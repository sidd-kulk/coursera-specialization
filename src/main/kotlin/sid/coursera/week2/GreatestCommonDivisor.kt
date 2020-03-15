package sid.coursera.week2

fun greatestCommonDivisor(a: Int, b: Int): Int {
    val loopCount = minOf(a, b) // Take the smallest amont the two numbers
    return (1 .. loopCount).filter { a % it == 0 && b % it == 0}.max()!!
}

fun euclideanAlgorithm(a: Int, b: Int): Int {
    if (b == 0) return a
    return euclideanAlgorithm(b, a % b)
}