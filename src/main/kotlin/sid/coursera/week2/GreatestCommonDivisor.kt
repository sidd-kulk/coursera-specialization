package sid.coursera.week2

fun greatestCommonDivisor(a: Int, b: Int): Int {
    val loopCount = if (a > b)  b else a // Take the smallest amont the two numbers
    return (1 .. loopCount).filter { a % it == 0 && b % it == 0}.max()!!
}