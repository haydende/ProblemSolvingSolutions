package kotlin_solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class JumpingOnCloudsTest {

    @Test
    fun for_0010010_min_should_be_4() {
        var actualJumps = jumpingOnClouds(arrayOf(0,0,1,0,0,1,0))
        assertEquals(4, actualJumps);
    }

    @Test
    fun for_000100_min_should_be_3() {
        var actualJumps  = jumpingOnClouds(arrayOf(0,0,0,1,0,0));
        assertEquals(3, actualJumps);
    }

}