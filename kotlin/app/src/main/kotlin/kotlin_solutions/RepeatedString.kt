package kotlin_solutions

import kotlin.math.roundToLong

/**
 * https://www.hackerrank.com/challenges/repeated-string
 */
fun repeatedString(s: String, n: Long): Long {
    val countFromOriginal = s.count { it == 'a' }
    var newCount = 0L
    if (countFromOriginal != 0) {
        newCount = (n * (countFromOriginal.toDouble() / s.length.toDouble())).roundToLong()
    }
    return newCount;
}