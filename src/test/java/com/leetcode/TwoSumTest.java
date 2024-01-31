package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TwoSumTest {
    private TwoSum twoSum = new TwoSum();

    @Test
    void given_two_numbers_find_the_target_sum() {
        int[] result = twoSum.twoSum(new int[]{2, 6}, 8);
        int[] expected = new int[]{0,1};
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void given_four_numbers_find_the_target_sum() {
        int[] result = twoSum.twoSum(new int[]{2,7,11,15}, 22);
        int[] expected = new int[]{1,3};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void given_five_numbers_with_duplicates_find_the_target_sum() {
        int[] result = twoSum.twoSum(new int[]{2,7,7,15}, 14);
        int[] expected = new int[]{1,2};
        assertThat(result).isEqualTo(expected);
    }

}