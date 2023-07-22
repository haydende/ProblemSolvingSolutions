package kotlin_solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class RepeatedStringTest {

    /**
     * Input:
     * - s: aba
     * - n: 10
     *
     * Expected output: 7
     */
    @Test
    fun sampleTestCase0() {
        val actual = repeatedString("aba", 10L)
        assertEquals(7L, actual)
    }

    /**
     * Input:
     * - s: a
     * - n: 1000000000000
     *
     * Expected output: 1000000000000
     */
    @Test
    fun sampleTestCase1() {
        val actual = repeatedString("a", 1000000000000L)
        assertEquals(1000000000000L, actual)
    }

    /**
     * Input:
     * - s: ab
     * - n: 1000000000000
     *
     * Expected output: 500000000000
     */
    @Test
    fun customTestCase0() {
        val actual = repeatedString("ab", 1000000000000L)
        assertEquals(500000000000L, actual)
    }

    /**
     * Input:
     * - s: aba
     * - n: 1000000000000
     *
     * Expected output: 666666666667L
     */
    @Test
    fun customTestCase1() {
        val actual = repeatedString("aba", 1000000000000L)
        assertEquals(666666666667L, actual)
    }

    /**
     * Input:
     * - s: gfcaaaecbg
     * - n: 547602
     *
     * Expected Output: 164280
     */
    @Test
    fun testCase4() {
        val actual = repeatedString("gfcaaaecbg", 547602L)
        assertEquals(164280L, actual)
    }

    /**
     * Input:
     * - s: epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq
     * - n: 549382313570
     *
     * Expected Output: 16481469408
     */
    @Test
    fun testCase9() {
        val actual = repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570L)
        assertEquals(16481469408, actual)
    }

    // s.length = 100
    // 46 a's in s = 0.46/46%
    // 860622337747 * 0.46 = 395886275363.62

    // target length (t) = 860622337747
    // t / s.length = 8606223377.47
    // number of a's in s at length 8606223377 = 3958862753
    // number of a's in first 47% of s = 19
    // 3958862753 + 19 = 3958862772

    /**
     * Input:
     * - s: babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb
     * - s: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     * - n: 860622337747
     *
     * Expected Output: 395886275361
     */
    @Test
    fun testCase11() {
        val actual = repeatedString(
            "babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb", 860622337747L
        )
        assertEquals(395886275361L, actual)
    }

    /**
     * Input:
     * - s: cfimaakj
     * - n: 554045874191
     *
     * Expected output: 138511468548
     */
    @Test
    fun testCase21() {
        val actual = repeatedString("cfimaakj", 554045874191L)
        assertEquals(138511468548L, actual)
    }

}