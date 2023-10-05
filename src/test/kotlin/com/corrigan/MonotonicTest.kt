package com.corrigan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MonotonicTest {

    @Test
    fun `given an integer array of size 2 and values 1,2 return true`() {
            assertThat(Monotonic.isMonotonic(intArrayOf(1,2))).isTrue()
    }

    @Test
    fun `given an integer array of size 4 and values 1,2,2,3 return true`() {
        assertThat(Monotonic.isMonotonic(intArrayOf(1,2,2,3))).isTrue()
    }

    @Test
    fun `given an integer array of size 4 and values 6,5,4,4 return true`() {
        assertThat(Monotonic.isMonotonic(intArrayOf(6,5,4,4))).isTrue()

    }

    @Test
    fun `given an integer array of size 3 and values 1,3,2 return true`() {
        assertThat(Monotonic.isMonotonic(intArrayOf(1,3,2))).isFalse()

    }


}