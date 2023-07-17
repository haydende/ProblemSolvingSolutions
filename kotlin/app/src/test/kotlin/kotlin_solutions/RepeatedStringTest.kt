package kotlin_solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class RepeatedStringTest {

    @Test
    fun aba_10_should_be_7() {
        val actual = repeatedStringAlt("aba", 10L)
        assertEquals(7L, actual)
    }

    @Test
    fun a_1000000000000_should_be_1000000000000() {
        val actual = repeatedStringAlt("a", 1000000000000L)
        assertEquals(1000000000000L, actual)
    }

}