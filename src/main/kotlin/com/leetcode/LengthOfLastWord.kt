package com.leetcode

object LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        return s.split(" ")
            .last{ it.trim().isNotEmpty()}
            .length
    }

}

fun main() {
    println(LengthOfLastWord.lengthOfLastWord(" hi there mike "))
}