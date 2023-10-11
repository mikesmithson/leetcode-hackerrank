package com.leetcode


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LRUCacheOverrideLinkedHashmapTest {

    @Test
    fun `given a cache of size 2, when putting 1,1 and 2,2 calling get returns the right values`() {
        val lruCacheOverrideLinkedHashmap = LRUCacheOverrideLinkedHashmap(2).also {
            it.put(1,1)
            it.put(2,2)
        }
        assertThat(lruCacheOverrideLinkedHashmap.get(1)).isEqualTo(1)
        assertThat(lruCacheOverrideLinkedHashmap.get(2)).isEqualTo(2)
    }
}