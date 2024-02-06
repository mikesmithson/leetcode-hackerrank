package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesIIITest {
    MaxConsecutiveOnesIII max = new MaxConsecutiveOnesIII();

    @Test
    void given_an_array_of_size_11_and_5_zeros_with_constraint_of_two_zeros() {
        assertThat(max.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)).isEqualTo(6);
    }

    @Test
    void another_example_with_8_zeros_and_11_ones_constraint_of_3_zeros() {
        assertThat(max.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)).isEqualTo(6);
    }
}