package com.leetcode

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val firstList = nums1.take(m).toList()
        val secondList = nums2.take(n).toList()
        nums1.drop(0)
        val result = firstList.plus(secondList).sorted()
        nums1.toMutableList().addAll(result)
    }
}