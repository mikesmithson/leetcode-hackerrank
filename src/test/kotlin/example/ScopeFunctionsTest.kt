package example

import org.junit.jupiter.api.Test

class ScopeFunctionsTest {
    @Test
    fun `let function test`() {
        ScopeFunctions().let(mutableListOf("one", "two", "three", "four"))
    }
}