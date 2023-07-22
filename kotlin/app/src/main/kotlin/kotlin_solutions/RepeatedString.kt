package kotlin_solutions

/**
 * https://www.hackerrank.com/challenges/repeated-string
 */
fun repeatedString(s: String, n: Long): Long {

    // Get the number of a's from the original string
    val countFromOriginal = s.count() { it == 'a'}

    // Number of a's in whole portion of the new string length
    val countFromNewLength = countFromOriginal * (n / s.length)

    // Number of a's in the remaining portion of the new string length
    val countFromNewRemainder = s.substring(0, (n % s.length).toInt()).count { it == 'a' }

    // Combine those together to get your answer
    return countFromNewLength + countFromNewRemainder
}