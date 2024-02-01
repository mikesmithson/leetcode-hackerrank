package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseStringTest {
    private ReverseString reverseString = new ReverseString();
    @Test
    void hello_becomes_olleh() {
        char[] result = reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertThat(result).isEqualTo(new char[]{'o', 'l', 'l', 'e', 'h'});
    }
}