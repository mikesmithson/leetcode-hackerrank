package com.leetcode

class LRUCache(var capacity: Int) {
    private var dic: LinkedHashMap<Int?, Int?> = object : LinkedHashMap<Int?, Int?>(5, 0.75f, true) {
        override fun removeEldestEntry(eldest: Map.Entry<Int?, Int?>): Boolean {
            return size > capacity
        }
    }

    operator fun get(key: Int): Int? {
        return dic.getOrDefault(key, -1)
    }

    fun put(key: Int, value: Int) {
        dic[key] = value
    }
}