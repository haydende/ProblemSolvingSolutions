
package kotlin_solutions

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    var jumps = 0
    var pos = 0

    while (pos < c.size - 1) {
        if (c.size - pos < 3) {
            jumps++
            break
        }
        var plusTwo = c[pos + 2]

        if (plusTwo != 1) {
            pos += 2
        } else {
            pos++
        }
        jumps++
    }

    return jumps
}
