package com.leetcode

import com.leetcode.NameMatch.nameMatch
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NameMatchTest {

    @Test
    fun `given exact matches, return appropriate true or false`() {
        val knownAliases = listOf("Alphonse Gabriel Capone", "Al Capone")
        assertThat(nameMatch(knownAliases, "Alphonse Gabriel Capone")).isTrue
        assertThat(nameMatch(knownAliases, "Al Capone")).isTrue
        assertThat(nameMatch(knownAliases, "Alphonse Francis Capone")).isFalse
    }

    @Test
    fun `when the middle name is missing on the alias, return appropriate true or false`() {
        val knownAliases = listOf("Alphonse Capone")
        assertThat(nameMatch(knownAliases, "Alphonse Gabriel Capone")).isTrue
        assertThat(nameMatch(knownAliases, "Alphonse Francis Capone")).isTrue
        assertThat(nameMatch(knownAliases, "Alexander Capone")).isFalse
    }

    @Test
    fun `when the middle name is missing on the record, return appropriate true or false`() {
        val knownAliases = listOf("Alphonse Gabriel Capone")
        assertThat(nameMatch(knownAliases, "Alphonse Capone")).isTrue
        assertThat(NameMatch.nameMatch(knownAliases, "Alphonse Francis Capone")).isFalse
        assertThat(NameMatch.nameMatch(knownAliases, "Alexander Capone")).isFalse
    }

    @Test
    fun `sanity check`() {
        val knownAliases = listOf("Alphonse Gabriel Capone", "Alphonse Francis Capone")
        assertThat(nameMatch(knownAliases, "Alphonse Gabriel Capone")).isTrue
        assertThat(nameMatch(knownAliases, "Alphonse Francis Capone")).isTrue
        assertThat(nameMatch(knownAliases, "Alphonse Edward Capone")).isFalse
    }

    @Test
    fun `the middle inital matches middle name`() {
        val knownAliases = listOf("Alphonse Gabriel Capone", "Alphonse F Capone")
        assertThat(nameMatch(knownAliases,"Alphonse G Capone")).isTrue
        assertThat(nameMatch(knownAliases,"Alphonse Francis Capone")).isTrue
        assertThat(nameMatch(knownAliases,"Alphonse E Capone")).isFalse
        assertThat(nameMatch(knownAliases,"Alphonse Edward Capone")).isFalse
        assertThat(nameMatch(knownAliases,"Alphonse Gregory Capone")).isFalse
    }
}