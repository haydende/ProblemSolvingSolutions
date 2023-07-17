package kotlin_solutions

/**
 * https://www.hackerrank.com/challenges/repeated-string
 */
fun repeatedString(s: String, n: Long): Long {
    var pos = 0
    var counter = 0L
    for (i in 0..n ) {
        val char = s[pos]
        pos++
        if ('a'.equals(char)) {
            counter++
        }
        if (pos == s.length) {
            pos = 0
        }
    }
    return counter
}

fun repeatedStringAlt(s: String, n: Long): Long {
    val countFromOriginal = s.count { it == 'a' }
    if (countFromOriginal == s.length) {
        return n
    }
    val percentage = countFromOriginal / s.length
    return n * percentage;

    // deduce percentage of original string containing the character
    // abc = 1 x a / 3 = 0.33
    // abcabc = 2 x a / 6
}