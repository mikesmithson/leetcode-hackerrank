package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestSubArrayTest {

    @Test
    void given_an_array_of_length_9_return_the_largest_subarray_equal_to_8_or_less() {
        int[] subarray = new int[]{3, 1, 2, 7, 4, 2, 1, 1, 5};
        int lengthOfLargestSubArray = LongestSubArray.findLength(subarray, 8);
        assertThat(lengthOfLargestSubArray).isEqualTo(4);
    }

}