package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryStringFlipTest {
    private BinaryStringFlip flip = new BinaryStringFlip();

    @Test
    void given_a_string_with_3_zeros_and_5_ones_return_1011() {
        String binary = "11001011";
        Integer expected = 4;

        assertThat(flip.findLength(binary)).isEqualTo(expected);
    }

    @Test
    void given_a_string_with_3_zeros_and_7_ones_return_1111100111() {
        String binary = "1101100111";
        Integer expected = 5;

        assertThat(flip.findLength(binary)).isEqualTo(expected);
    }

}