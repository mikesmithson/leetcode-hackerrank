
package com.corrigan

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class SomethingTest {
    @Test
    fun alwaysReturnsTrue() {
        Assertions.assertThat(Something().alwaysTrue()).isTrue()
    }
}
