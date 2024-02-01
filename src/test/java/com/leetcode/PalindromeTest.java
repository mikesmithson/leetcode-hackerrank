package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PalindromeTest {

    @Test
    void racecar_is_valid() {
        assertThat(Palindrome.isPalindrome("racecar")).isTrue();
    }

    @Test
    void ehcache_is_valid() {
        assertThat(Palindrome.isPalindrome("racecar")).isTrue();
    }

    @Test
    void baseball_is_inValid() {
        assertThat(Palindrome.isPalindrome("baseball")).isFalse();
    }

}