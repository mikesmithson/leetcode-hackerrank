package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnagramTest {

    @Test
    void valid_anagram() {
        assertThat(Anagram.isAnagram("anagram", "nagaram")).isTrue();
    }
    @Test
    void invalid_anagram() {
        assertThat(Anagram.isAnagram("true", "false")).isFalse();
    }

}