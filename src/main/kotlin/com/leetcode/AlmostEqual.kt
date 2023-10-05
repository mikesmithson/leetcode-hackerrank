package com.leetcode

import kotlin.math.abs

object AlmostEqual {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val occurrencesOne = mutableMapOf<Char, Int>()
        val occurrencesTwo = mutableMapOf<Char, Int>()
        for(i in 97..122) {
            occurrencesOne[i.toChar()] = 0
            occurrencesTwo[i.toChar()] = 0
        }
        for(c in word1) {
            occurrencesOne[c] = occurrencesOne[c]!! + 1
        }

        for(c in word2) {
            occurrencesTwo[c] = occurrencesTwo[c]!! + 1
        }

        occurrencesOne.forEach { (key, value) ->
            val otherOccurrences = occurrencesTwo.getOrDefault(key,0)
            if(abs(value - otherOccurrences) > 3) {
                return false
            }
        }
        return true
    }

}


fun main() {
    println(AlmostEqual.checkAlmostEquivalent("zzzyyy", "iiiiii"))
}