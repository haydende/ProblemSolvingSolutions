package kotlin_solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class RepeatedStringTest {

    @Test
    fun aba_10_should_be_7() {
        val actual = repeatedString("aba", 10L)
        assertEquals(7L, actual)
    }

    @Test
    fun a_1000000000000_should_be_1000000000000() {
        val actual = repeatedString("a", 1000000000000L)
        assertEquals(1000000000000L, actual)
    }

    @Test
    fun ab_1000000000000_should_be_500000000000() {
        val actual = repeatedString("ab", 1000000000000L)
        assertEquals(500000000000L, actual)
    }

    @Test
    fun aba_1000000000000_should_be_670000000000() {
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

    /**
     * Input:
     * - s: babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb
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

}