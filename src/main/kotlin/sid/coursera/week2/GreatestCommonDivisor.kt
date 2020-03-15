package sid.coursera.week2

fun greatestCommonDivisor(a: Int, b: Int): Int {
    val loopCount = if (a > b)  a else b

    var gcd = 1

    for(i in 1 .. loopCount) {
        if(a % i == 0 && b % i == 0) {
            gcd = i
        }
    }
    return gcd
}