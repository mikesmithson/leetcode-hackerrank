package com.corrigan

object Monotonic {
    fun isMonotonic(ints: IntArray): Boolean {
        val state = mutableSetOf<String>()
        ints.toList().windowed(size = 2, step = 1).forEach {
            when {
                it[0] > it[1] -> state.add("decreasing")
                it[0] < it[1] -> state.add("increasing")
                else -> state.add("same")
            }
        }
        return state.containsAll(setOf("increasing", "decreasing")).not()
    }

}