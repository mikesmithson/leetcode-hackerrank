package com.leetcode


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LRUCacheTest {

    @Test
    fun `given a cache of size 2, when putting 1,1 and 2,2 calling get returns the right values`() {
        val lruCache = LRUCache(2).also {
            it.put(1,1)
            it.put(2,2)
        }
        assertThat(lruCache.get(1)).isEqualTo(1)
        assertThat(lruCache.get(2)).isEqualTo(2)
    }
}